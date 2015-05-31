//VARIABLES GLOBALES

var bounds = new OpenLayers.Bounds(366582.582, 6127927, 858252.252, 6671738);


var mapoptions = {

	units : 'm',
	projection : "EPSG:32721",
	maxExtent : bounds,
	center : new OpenLayers.LonLat(574553.537, 6141267.75),
	maxResolution : 1000

};

var map, drawControls;

var saveStrategy = new OpenLayers.Strategy.Save();
saveStrategy.events.on({
    'success': function(event) {
         alert('Changes saved');
    },
    'fail': function(event) {
         alert('Error! Changes not saved');
    },
    scope: this
});

/////////////////

function init() {
	

		
    map = new OpenLayers.Map('map', mapoptions);
	// setup tiled layer
	var tiled = new OpenLayers.Layer.WMS(

	"mapabase", "http://localhost:8080/geoserver/sige/wms", {
		LAYERS : 'sige:mapabase',
		projection : new OpenLayers.Projection('EPSG:32721')
	}

	);

	polygonLayer = new OpenLayers.Layer.Vector("ZonaGeom", {
		strategies : [ new OpenLayers.Strategy.BBOX(), saveStrategy ],
		projection : new OpenLayers.Projection("EPSG:32721"),
		protocol : new OpenLayers.Protocol.WFS({
			version : "1.1.0",
			srsName : "EPSG:32721",
			url : "http://localhost:8080/geoserver/wfs",
			featurePrefix : 'sige', // geoserver worspace name
			featureType : "ZonaGeom", // geoserver Layer Name
			featureNS : "localhost:8080/geoserver/sige", // Edit Workspace
			// Namespace URI
			geometryName : "geom", // field in Feature Type details with type
		// "Geometry"

		})

	});

	    

    //var polygonLayer = new OpenLayers.Layer.Vector("Polygon Layer");
    var boxLayer = new OpenLayers.Layer.Vector("Box layer");
	
    map.addLayers([ tiled, polygonLayer, boxLayer ]);    
    map.addControl(new OpenLayers.Control.LayerSwitcher());    
    map.zoomTo(7);
    

	drawControls = {
		polygon : new OpenLayers.Control.DrawFeature(polygonLayer,
				OpenLayers.Handler.Polygon),
		box : new OpenLayers.Control.DrawFeature(boxLayer,
				OpenLayers.Handler.RegularPolygon, {
					handlerOptions : {
						sides : 4,
						irregular : true
					}
				})
	}	
	for(var key in drawControls) {
        map.addControl(drawControls[key]);	//Agrega todos los draw q estan en el arreglo drawControls 
    }
	
	drawControls[0].featureAdded = function(feature) {	//drawControls[0] = polygon
		
		feature.attributes.nombre="ZonaPolygon";
        feature.style.strokeColor = "#0000ff";
        feature.state = OpenLayers.State.INSERT;
        feature.layer.drawFeature(feature);
			
		
   }
	
}

function save() {

	alert("entre");
	saveStrategy.save();

}

function toggleControl(element) {
    for(key in drawControls) {
        var control = drawControls[key];
        if(element.value == key && element.checked) {
            control.activate();
        } else {
            control.deactivate();
        }
    }
}

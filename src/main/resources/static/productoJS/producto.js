function eliminar(){

	var idProducto = document.getElementById("txt_id").value;
	location.href="/producto/eliminar/" + idProducto;
	
}

function confirmar(idProducto){
	document.getElementById("txt_id").value=idProducto;

}

$(document).ready(function () {
    $('#tableP').DataTable({
		
		"columns":[
			{"data" : "idProducto"},
			{"data": "nombre"},
			{"data" : "id_Talla_fk"},
			{"data" : "id_Color_fk"},
			{"data" : "precio"},
			{"data" : "id_Categoria_fk"},
			{"data" : "id_Genero_fk"},
			{"data" : "foto"},
			{"data" : "estado"}
		]
		
	});
});
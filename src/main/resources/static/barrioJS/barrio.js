$(document).ready(function () {
    $('#example').DataTable();
});


function eliminar(){

	var idBarrio = document.getElementById("txt_id").value;
	location.href="/barrio/eliminare/" + idBarrio;
	
}

function confirmar(idBarrio){
	document.getElementById("txt_id").value=idBarrio;

}
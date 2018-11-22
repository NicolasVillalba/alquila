//----------------------------------------Previsualizar imagenes--------------------------------------------
function readURL1(input) {
	if (input.files && input.files[0]) {
		var reader = new FileReader();
		var div_id = $(input).attr('set-to');
		reader.onload = function(e) {
			$('#' + div_id).attr('src', e.target.result);
			$('label[for="imageUploadpreview1"]').css('background-image',
					'url(' + e.target.result + ')');
			$('#thumb1').hide();
		}

		reader.readAsDataURL(input.files[0]);
	}
}

$('label[for="imageUpload1"]').change(function() {
	readURL(this);

});

function readURL2(input) {
	if (input.files && input.files[0]) {
		var reader = new FileReader();
		var div_id = $(input).attr('set-to');
		reader.onload = function(e) {
			$('#' + div_id).attr('src', e.target.result);
			$('label[for="imageUploadpreview2"]').css('background-image',
					'url(' + e.target.result + ')');
			$('#thumb2').hide();
		}

		reader.readAsDataURL(input.files[0]);
	}
}

$('label[for="imageUpload2"]').change(function() {
	readURL(this);

});

function readURL3(input) {
	if (input.files && input.files[0]) {
		var reader = new FileReader();
		var div_id = $(input).attr('set-to');
		reader.onload = function(e) {
			$('#' + div_id).attr('src', e.target.result);
			$('label[for="imageUploadpreview3"]').css('background-image',
					'url(' + e.target.result + ')');
			$('#thumb3').hide();
		}

		reader.readAsDataURL(input.files[0]);
	}
}

$('label[for="imageUpload3"]').change(function() {
	readURL(this);

});

function readURL4(input) {
	if (input.files && input.files[0]) {
		var reader = new FileReader();
		var div_id = $(input).attr('set-to');
		reader.onload = function(e) {
			$('#' + div_id).attr('src', e.target.result);
			$('label[for="imageUploadpreview4"]').css('background-image',
					'url(' + e.target.result + ')');
			$('#thumb4').hide();
		}

		reader.readAsDataURL(input.files[0]);
	}
}

$('label[for="imageUpload4"]').change(function() {
	readURL(this);

});

function readURL5(input) {
	if (input.files && input.files[0]) {
		var reader = new FileReader();
		var div_id = $(input).attr('set-to');
		reader.onload = function(e) {
			$('#' + div_id).attr('src', e.target.result);
			$('label[for="imageUploadpreview5"]').css('background-image',
					'url(' + e.target.result + ')');
			$('#thumb5').hide();
		}

		reader.readAsDataURL(input.files[0]);
	}
}

$('label[for="imageUpload5"]').change(function() {
	readURL(this);

});
// ----------------------------------------Validacion de campos obligatorios--------------------------------------------

var currentTab = 0; // Current tab is set to be the first tab (0)
showTab(currentTab); // Display the current tab

function showTab(n) {
	// This function will display the specified tab of the form ...
	var x = document.getElementsByClassName("tab");
	x[n].style.display = "block";
	// ... and fix the Previous/Next buttons:
	if (n == 0) {
		document.getElementById("prevBtn").style.display = "none";
	} else {
		document.getElementById("prevBtn").style.display = "inline";
	}
	if (n == (x.length - 1)) {
		document.getElementById("nextBtn").innerHTML = "ANUNCIAR";
//		document.getElementById("nextBtn").removeAttribute("onClick");
//		document.getElementById("nextBtn").type = "submit"
	} else {
		document.getElementById("nextBtn").innerHTML = "SIGUIENTE";
	}
	// ... and run a function that displays the correct step indicator:
	fixStepIndicator(n)
}

function nextPrev(n) {
	// This function will figure out which tab to display
	var x = document.getElementsByClassName("tab");
	// Exit the function if any field in the current tab is invalid:
	if (n == 1 && ($("#monto").val() == "") || ($("#inp1").val() == "")
			|| ($("#inp2").val() == "")
			|| ($("#expensas").attr('required') == "required"))
		if ($("#monto").val() == "") {
			window.alert("Falta ingresar un monto");
			return false;
		} else if ($("#inp1").val() == "") {
			window.alert("Falta ingresar la calle");
			return false;
		} else if ($("#inp2").val() == "") {
			window.alert("Falta ingresar la altura");
			return false;
		} else if (($("#expensas").val() == "")
				&& ($("#expensas").attr('required') == "required")) {
			window.alert("Falta ingresar las expensas");
			return false;
		}

	// Hide the current tab:
	x[currentTab].style.display = "none";
	// Increase or decrease the current tab by 1:
	currentTab = currentTab + n;
	// if you have reached the end of the form... :
	if (currentTab >= x.length) {
		// ...the form gets submitted:
		document.getElementById("form").submit();
		return false;
	}
	// Otherwise, display the correct tab:
	showTab(currentTab);
}

function fixStepIndicator(n) {
	// This function removes the "active" class of all steps...
	var i, x = document.getElementsByClassName("step");
	for (i = 0; i < x.length; i++) {
		x[i].className = x[i].className.replace(" active", "");
	}
	// ... and adds the "active" class to the current step:
	x[n].className += " active";
}

// ----------------------------- PAG1 Alta
// ------------------------------------------------------------------------
// ------------------------------Button Focus (Departamento & Casa)+ functions
// asociated ---------------------------------------------





//--------------------------


document.getElementById('sinexp').onclick = function() {
	$("#expensas").val('');
	$("#expensas").prop('disabled', true);
	$("#expensas").attr("required", false)
};
document.getElementById('conexp').onclick = function() {
	$("#expensas").removeAttr('disabled');
	$("#expensas").focus();
	$("#expensas").attr("required", true)
};

// ----------------------------------------------- PAG 2 Alta
// ---------------------------------------------------

document.getElementById('gcno').onclick = function() {
	$("#gastosc").val('');
	$("#gastosc").prop('disabled', true);
};
document.getElementById('gcsi').onclick = function() {
	$("#gastosc").removeAttr('disabled');
	$("#gastosc").focus();
};

document.getElementById('dno').onclick = function() {
	$("#deposito").val('');
	$("#deposito").prop('disabled', true);
};
document.getElementById('dsi').onclick = function() {
	$("#deposito").removeAttr('disabled');
	$("#deposito").focus();
};

// ------------------------------- Carga de info a los campos para el post----------------------
// ------------------------------- Tipo inmueble -------------------
$('#inputTipo').val('DEPARTAMENTO');
document.getElementById('casa').onclick = function() {
	$("#inputTipo").val('CASA');
	$("#departamento").val('');
	$("#piso").val('');
	$("#departamento").prop("disabled", true);
	$("#piso").prop("disabled", true);
};
document.getElementById('dpto').onclick = function(){
	$('#inputTipo').val('DEPARTAMENTO');
	$("#departamento").removeAttr('disabled');
	$("#piso").removeAttr('disabled');
};

//----------------------------------Cantidad ambientes ---------------------------------
document.getElementById('monoambiente').onclick = function() {
	$("#inputCantHamb").val('Monoambiente');
};
document.getElementById('1amb').onclick = function() {
	$("#inputCantHamb").val('1 ambiente');
};
document.getElementById('2amb').onclick = function() {
	$("#inputCantHamb").val('2 ambientes');
};
document.getElementById('3amb').onclick = function() {
	$("#inputCantHamb").val('3 ambientes');
};
document.getElementById('4amb').onclick = function() {
	$("#inputCantHamb").val('4 o mas ambientes');
};

//------------------------------- Informacion Legal --------------------------------------
$("#inputGarante").val('NO');
document.getElementById('gsi').onclick = function() {
	$("#inputGarante").val('SI');
};
document.getElementById('gno').onclick = function() {
	$("#inputGarante").val('NO');
};

$("#inputEscribania").val('NO');
document.getElementById('esi').onclick = function() {
	$("#inputEscribania").val('SI');
};
document.getElementById('eno').onclick = function() {
	$("#inputEscribania").val('NO');
};


$("#inputContrato").val('NO');
document.getElementById('csi').onclick = function() {
	$("#inputContrato").val('SI');
};
document.getElementById('cno').onclick = function() {
	$("#inputContrato").val('NO');
};

$("#inputGastosContrato").val('NO');
document.getElementById('gcsi').onclick = function() {
	$("#inputGastosContrato").val('SI');
};
document.getElementById('gcno').onclick = function() {
	$("#inputGastosContrato").val('NO');
};

$("#inputDepositoInicial").val('NO');
document.getElementById('dsi').onclick = function() {
	$("#inputDepositoInicial").val('SI');
};
document.getElementById('dno').onclick = function() {
	$("#inputDepositoInicial").val('NO');
};

$("#inputBañoAdicional").val('NO');
document.getElementById('bsi').onclick = function() {
	$("#inputBañoAdicional").val('SI');
};
document.getElementById('bno').onclick = function() {
	$("#inputBañoAdicional").val('NO');
};

$("#inputGarage").val('NO');
document.getElementById('grsi').onclick = function() {
	$("#inputGarage").val('SI');
};
document.getElementById('grno').onclick = function() {
	$("#inputGarage").val('NO');
};

$("#inputBalcon").val('NO');
document.getElementById('lsi').onclick = function() {
	$("#inputBalcon").val('SI');
};
document.getElementById('lno').onclick = function() {
	$("#inputBalcon").val('NO');
};

$("#inputPatio").val('NO');
document.getElementById('psi').onclick = function() {
	$("#inputPatio").val('SI');
};
document.getElementById('pno').onclick = function() {
	$("#inputPatio").val('NO');
};
$("#descripcion").val("");
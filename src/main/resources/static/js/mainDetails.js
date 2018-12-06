var wrap = $("#wrap");
var back = $("#back");
wrap.on("scroll", function(e) {

  if (this.scrollTop >147) {
    wrap.addClass("fix-search");
    back.addClass("topfix");
  } else {
    wrap.removeClass("fix-search");
    back.removeClass("topfix");
  }

});


//-------------------------------------------Informacion Legal-----------------------------------------------
if($("#gr").attr("value") == "SI"){
	$("#grsi2").css("display", "none")
}else{
	$("#grsi1").css("display", "none")
}

if($("#esi").attr("value") == "SI"){
	$("#esi2").css("display", "none")
}else{
	$("#esi1").css("display", "none")
}

if($("#csi").attr("value") == "SI"){
	$("#csi2").css("display", "none")
}else{
	$("#csi1").css("display", "none")
}

if($("#gcsi").attr("value") == "SI"){
	$("#gcsi2").css("display", "none")
}else{
	$("#gcsi1").css("display", "none")
	$("#spanGC").css("display", "none")
	
}

if($("#dsi").attr("value") == "SI"){
	$("#dsi2").css("display", "none")
}else{
	$("#dsi1").css("display", "none")
	$("#spanD").css("display", "none")
}

//-------------------------------------------Detalles de propiedad-------------------------------------------
if($("#banoad").attr("value") == "NO"){
	$("#spanBanoad").attr("class", "iconx")
}
if($("#garage").attr("value") == "NO"){
	$("#spanGarage").attr("class", "iconx")
}
if($("#balcon").attr("value") == "NO"){
	$("#spanBalcon").attr("class", "iconx")
}
if($("#patio").attr("value") == "NO"){
	$("#spanPatio").attr("class", "iconx")
}

$('.btn_container').click(function (e) {
    if($('#buscador-box').css('opacity') == 0){
        $('#buscador-box').animate({opacity: 1});
        $('#buscador-box').css("display", "flex");
    }
    else{
        $('#buscador-box').animate({opacity: 0});
        $('#buscador-box').css("display", "none");
    }
});
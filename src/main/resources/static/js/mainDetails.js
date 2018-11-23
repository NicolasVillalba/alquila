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
// /<reference path="query-1.5.1.min.js" />
 ( function ($) {
/* 监控页面数据是否发生变化 */
 var pageDataChange = false ;
    var tagName = " Input, Select, Textarea " ;
    var ctrlIds = [];
    $.fn.MonitorDataChange = function (options) {
    var deafult = {
    arrTags: tagName, // 需监控控件的tagName属性
    arrCtrls: ctrlIds // 不监控的控件ID
 };
     var ops = $.extend(deafult, options);
     tagName = ops.arrTags;
     ctrlIds = ops.arrCtrls;
     /* 元素第一次获取焦点时缓存该元素数据 */
     $(ops.arrTags).one( " focus " , function () {
     if ($.inArray($( this ).attr( " id " ), ops.arrCtrls) != - 1 ) {
     return ;
    }
     $( this ).data( ' initData ' , $( this ).val());
     });
     };
     /* 获取页面数据是否已经改变 */
    $.fn.isChange = function () {
    $(tagName).each( function () {
     if ($.inArray($( this ).attr( " id " ), ctrlIds) != - 1 ) {
     return ;
     }
     /* 如果该元素的initData缓存数据已定义并且不等于他的value值，标识该页面中数据发生变化 */
     if ( typeof ($( this ).data( ' initData ' )) != ' undefined ' ) {
     if ($( this ).data( ' initData ' ) != $( this ).val()) {
     pageDataChange = true ;
     }
     }
     });
     return pageDataChange;
    };
})(jQuery);
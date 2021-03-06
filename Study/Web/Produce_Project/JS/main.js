var options;
var options2;

$(document).ready(function () {
  options = {
    chart: {
      type: "line",
    },
    exporting: {
      enabled: false,
    },
    title: {
      text: "",
      x: -20, //center
    },
    xAxis: {
      categories: [],
    },
    yAxis: {
      title: {
        text: "",
      },
      labels: {
        formatter: function () {
          return Highcharts.numberFormat(this.value, 0, ",", ",");
        },
      },
      plotLines: [
        {
          value: 0,
          width: 1,
          color: "#808080",
        },
      ],
    },
    tooltip: {
      useHTML: true,
      formatter: function () {
        var text = "";
        text =
          this.x +
          "<br>" +
          "<span style='color:" +
          this.series.color +
          ";'>\u25CF</span> " +
          this.series.name +
          " : <b>" +
          Highcharts.numberFormat(this.y, 0, ",", ",") +
          "</b>";
        return text;
      },
    },
    series: [],
  };

  options2 = {
    chart: {
      type: "line",
    },
    exporting: {
      enabled: false,
    },
    title: {
      text: "",
      x: -20, //center
    },
    xAxis: {
      categories: [],
    },
    yAxis: {
      title: {
        text: "",
      },
      labels: {
        formatter: function () {
          return Highcharts.numberFormat(this.value, 0, ",", ",");
        },
      },
    },
    plotOptions: {
      area: {
        marker: {
          enabled: false,
          symbol: "circle",
          radius: 2,
          states: {
            hover: {
              enabled: true,
            },
          },
        },
      },
    },
    tooltip: {
      useHTML: true,
      formatter: function () {
        var text = "";
        text =
          this.x +
          "<br>" +
          "<span style='color:" +
          this.series.color +
          ";'>\u25CF</span> " +
          this.series.name +
          " : <b>" +
          Highcharts.numberFormat(this.y, 0, ",", ",") +
          "</b>";
        return text;
      },
    },
    series: [],
  };

  $("#customeritem").click(function () {
    $("#frm_customer_item").submit();
    return false;
  });
});

// ???????????? ???????????? ??????(???????????? ????????? ???)
function changeGraphWholesaleView(
  l_productno,
  l_latest_day,
  l_product_name,
  l_product_unit
) {
  /*alert("l_productno >>> " + l_productno);
	alert("l_latest_day >>> " + l_latest_day);
	alert("l_product_name >>> " + l_product_name);
	alert("l_product_unit >>> " + l_product_unit);*/

  //????????????
  Main.Wholesale.showChartTransition(l_latest_day, l_productno);
  //?????????
  Main.Wholesale.showChartMonthly(l_latest_day, l_productno);
  //?????????
  Main.Wholesale.showChartYearly(l_latest_day, l_productno);

  $("#chartName1").text(l_product_name);
  $("#chartUnit1").text(" (" + l_product_unit + ",???)");
  $(".pop_main_graph", top.document).fadeIn("fast");
}

// ???????????? ???????????? ??????(???????????? ????????? ???)
function changeGraphRetailView(
  l_productno,
  l_latest_day,
  l_product_name,
  l_product_unit
) {
  Main.Retail.showChartTransition(l_latest_day, l_productno);
  Main.Retail.showChartMonthly(l_latest_day, l_productno);
  Main.Retail.showChartYearly(l_latest_day, l_productno);
  $("#chartName2").text(l_product_name);
  $("#chartUnit2").text(" (" + l_product_unit + ",???)");

  $(".pop_main_graph2", top.document).fadeIn("fast");
}

function changeCate(id, code) {
  if (code == "0") {
    $(".catecode").hide();
    $("#" + id + "_cate").show();
    $(".list_ty1 li").removeClass("on");
    $("#" + id + "_cate li")
      .eq(0)
      .addClass("on");
    $(".codelist").hide();
    $("#" + id + "_list").show();
    $(".itemcode").hide();
    $("#" + id + "_list ul")
      .eq(0)
      .show();
  } else {
    $(".itemcode").hide();
    $("#" + id + "_item_" + code).show();
    $(".list_ty1 li").removeClass("on");
    $("#cate_" + id + "_" + code).addClass("on");
  }
}

var Main = {
  /**
   * ??????
   */
  Wholesale: {
    /**
     * ?????? ?????? ???????????? ?????? ?????? ??????
     * @param p_latest_day : ?????? ???????????????
     * @param p_productno : ?????? ????????????
     */
    showChartTransition: function (p_latest_day, p_productno) {
      try {
        var l_url = "/customer/main/main.do?action=TransitionByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options.title.text = "";
              options.xAxis.categories = JSON.parse(data["categories2"]);
              options.series = JSON.parse(data["data2"]);
              $("#chartTable1").highcharts(options);
            }
          },
          error: function (xhr, errmsg, errobj) {
            alert(errmsg + "1111");
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Wholesale.showChartTransition] " +
            e.message
        );
      }
    },

    /**
     * ?????? ?????? ???????????? ?????? ?????? ??????
     * @param p_latest_day : ?????? ???????????????
     * @param p_productno : ?????? ????????????
     */
    showChartMonthly: function (p_latest_day, p_productno) {
      try {
        p_latest_day = p_latest_day.substr(0, 7);
        var l_url = "/customer/main/main.do?action=ChartMonthlyByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options2.title.text = "";
              options2.xAxis.categories = JSON.parse(data["categories2"]);
              options2.series = JSON.parse(data["data2"]);
              $("#chartTable2").highcharts(options2);
            }
          },
          error: function (xhr, errmsg, errobj) {
            alert(errmsg + "2222");
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Wholesale.showChartMonthly]" +
            e.message
        );
      }
    },

    /**
     * ???????????? ????????? ???????????? ?????? ??????
     * @param p_latest_day : ?????? ???????????? ??????
     * @param p_productno : ?????? ????????????
     */
    showChartYearly: function (p_latest_day, p_productno) {
      try {
        p_latest_day = p_latest_day.substr(0, 4);
        var l_url = "/customer/main/main.do?action=ChartYearlyByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options2.title.text = "";
              options2.xAxis.categories = JSON.parse(data["categories2"]);
              options2.series = JSON.parse(data["data2"]);
              $("#chartTable3").highcharts(options2);
            }
          },
          error: function (xhr, errmsg, errobj) {
            alert(errmsg + "3333");
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Wholesale.showCharYearly]" +
            e.message
        );
      }
    },
  },

  /**
   * ??????
   */

  Retail: {
    /*
		  ???????????? ????????? ???????????? ?????? ??????
		  @param p_latest_day : ?????? ???????????? ??????
		  @param p_productno : ?????? ????????????
		 */
    showChartTransition: function (p_latest_day, p_productno) {
      try {
        var l_url = "/customer/main/main.do?action=TransitionByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options.title.text = "";
              options.xAxis.categories = JSON.parse(data["categories2"]);
              options.series = JSON.parse(data["data2"]);
              $("#chartTable4").highcharts(options);
            }
            console.log(data);
          },
          error: function (xhr, errmsg, errobj) {
            alert("xhr ===" + xhr);
            alert("errmsg ===" + errmsg);
            alert("errobj ===" + errobj);
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Retail.showChartTransition] " +
            e.message
        );
      }
    },
    /*
		  ???????????? ????????? ???????????? ?????? ??????
		  @param p_latest_day : ?????? ???????????? ??????
		  @param p_productno : ?????? ????????????
		 */
    showChartMonthly: function (p_latest_day, p_productno) {
      try {
        p_latest_day = p_latest_day.substr(0, 7);
        var l_url = "/customer/main/main.do?action=ChartMonthlyByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options2.title.text = "";
              options2.xAxis.categories = JSON.parse(data["categories2"]);
              options2.series = JSON.parse(data["data2"]);
              $("#chartTable5").highcharts(options2);
            }
          },
          error: function (xhr, errmsg, errobj) {
            alert(errmsg + "444");
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Retail.showChartMonthly]" + e.message
        );
      }
    },
    /*
		  ???????????? ????????? ???????????? ?????? ??????
		  @param p_latest_day : ?????? ???????????? ??????
		  @param p_productno : ?????? ????????????
		 */
    showChartYearly: function (p_latest_day, p_productno) {
      try {
        p_latest_day = p_latest_day.substr(0, 4);
        var l_url = "/customer/main/main.do?action=ChartYearlyByAjax";
        $.ajax({
          type: "post",
          url: l_url,
          data: { latest_day: p_latest_day, productno: p_productno },
          dataType: "json",
          contentType: "application/x-www-form-urlencoded; charset=UTF-8",
          success: function (data) {
            if (data["categories2"].length > 0) {
              options2.title.text = "";
              options2.xAxis.categories = JSON.parse(data["categories2"]);
              options2.series = JSON.parse(data["data2"]);
              $("#chartTable6").highcharts(options2);
            }
          },
          error: function (xhr, errmsg, errobj) {
            alert(errmsg + "555");
          },
        });
      } catch (e) {
        alert(
          "[/js/customer/main/main.js Main.Retail.showCharYearly]" + e.message
        );
      }
    },
  },
};

const API_URL = "https://floating-harbor-78336.herokuapp.com/fastfood";

//검색버튼 클릭시,
$(function () {
  $(".btn-search").click(function () {
    const searchKeyword = $("#txt-search").val(); // 양식의 값을 가져오는 메소드 => 검색창 텍스트을 가져온다.
    search(1, 10, searchKeyword);
  });
});

function search(page, perPage, searchKeyword) {
  //페이지 매개변수가 number가 아니거나 1미만이면 1로 고정함
  if (typeof page !== "number" || page < 1) page = 1;
  // 펄 페이지 매개변수가 number가 아니거나 0보다 작으면 10으로 고정
  if (typeof perPage !== "number" || page <= 0) perPage = 10;

  //제이쿼리 비동기 통신 $.get() HTTP GET 요청을 하여 서버로부터 데이터를 로드한다.
  $.get(
    //요청할 URL
    API_URL,
    //요청에 포함시킬 인자들 키값,밸브값을 추가해준것
    { page: page, perPage: perPage, searchKeyword: searchKeyword },
    //응답이 왔을때 실행할 함수(콜백함수)
    //제이쿼리.get()에서 무명콜백함수의 매개변수는 1번째는 데이터객체,2번째는 성공여부,3번째는 데이터타입을 전달한다.
    function (data, b, c) {
      console.log(data);
      console.log(b);
      console.log(c);
      const list = data.list;
      const total = data.total;
      $(".total").html("총" + total + "개의 패스트푸드점을 찾았다.");

      const $list = $(".list").empty(); //요소의 내용을 지우는 메소드

      for (let i = 0; i < list.length; i++) {
        let item = list[i];
        //정의된 아이템 템플레이트 요소을 복사후 id는 제거함
        const $elem = $("#item-template").clone().removeAttr("id");

        //복사된 요소의 넘버링,이름,주소 클래스 요소을 찾아 내용 추가한후
        $elem.find(".item-no").html(i + 1);
        $elem.find(".item-name").html(item.name);
        $elem.find(".item-addr").html(item.addr);

        //리스트에 추가한다.
        $list.append($elem);
      }
      showPaging(page, perPage, total);
    }
  );
}

// 페이지 검색결과내에
function showPaging(page, perPage, total) {
  const $paging = $(".paging").empty();
  let numPages = 5; // 선택 가능한 페이지 항목 수
  let pageStart = Math.floor((page - 1) / numPages) * numPages + 1;
  let pageEnd = pageStart + numPages - 1;
  let totalPages = Math.floor(total / perPage) + 1;

  if (pageEnd > totalPages) pageEnd = totalPages;

  //
  let prevPage = pageStart - 1;
  let nextPage = pageEnd + 1;
  if (prevPage < 1) prevPage = 1;
  if (nextPage > totalPages) nextPage = totalPages;

  const $prevElem = $(
    '<a href ="javascript:search(' + prevPage + "," + perPage + ')">이전</a>'
  );
  $prevElem.addClass("prev");
  $paging.append($prevElem);

  for (let i = pageStart; i <= pageEnd; i++) {
    //perPage 추가
    const $elem = $(
      '<a href="javascript:search(' + i + "," + perPage + ')">' + i + "</a>"
    );

    if (i === page) {
      $elem.addClass("current");
    }
    $paging.append($elem);
  }
  const $nextElem = $(
    '<a href ="javascript:search(' + nextPage + "," + perPage + ')">다음</a>'
  );
  $nextElem.addClass("next");
  $paging.append($nextElem);
}

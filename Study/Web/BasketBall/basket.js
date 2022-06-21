function On_Computer_Shot() {
  const text_element = document.getElementById("text");
  const shot_type = Math.random() < 0.5 ? 2 : 3;

  if (shot_type === 2) {
    if (Math.random() < 0.5) {
      text_element.innerHTML = "2점슛 성공";
    } else {
      text_element.innerHTML = "2점슛 실패";
    }
  } else {
    if (Math.random < 0.33) {
      text_element.innerHTML = "3점슛 성공";
    } else {
      text_element.innerHTML = "3점슛 실패";
    }
  }
}

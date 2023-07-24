const modal = document.getElementById("myModal");
const btn = document.getElementById("openModalBtn");
const closeSpan = document.getElementsByClassName("close")[0];

btn.onclick = function () {
  modal.style.display = "block";
};

closeSpan.onclick = function () {
  modal.style.display = "none";
};

window.onclick = function (event) {
  if (event.target === modal) {
    modal.style.display = "none";
  }
};
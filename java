/* this whole  code open and close navigation tab on mobile and tablet */
let sidemenu = document.getElementById("sidemenu");

/** this function openmenu() brings the content out */
function openmenu() {
  sidemenu.style.right = "0";
}
/** this function closemenu() takes out the content out from
     from the style.css */
function closemenu() {
  sidemenu.style.right = "-400px";
}

let x = document.getElementById("clicked");
let togglcolor = document.getElementById("sun-toggle");
let theme = document.getElementById("theme1");
let btn1 = document.getElementById('moon-toggle')
let maintext = document.getElementById("text-one");
let secondtext = document.getElementById("text-two");
let for_nav = document.querySelectorAll('.p-nav-links');

/**light mode */
function suntoggle() {
  /** mobile */
  if (window.innerWidth < 1028) {
    x.style.backgroundColor = "#ffffff";
    theme.style.backgroundColor = " #ffff00";

    maintext.style.color = "#000000";
    maintext.style.backgroundColor = "#ffffff";

    secondtext.style.color = "#000000";
    secondtext.style.backgroundColor = "#ffffff";

    for_nav.forEach((box) => {
        box.style.color = 'lightblue'; // Change the background color of each box
      });


  } else if (window.innerWidth > 1028) {
  /** desktop */
    x.style.backgroundColor = "#ffffff";
    theme.style.backgroundColor = " #ff0000";

    maintext.style.color = "#000000";
    maintext.style.backgroundColor = "#ffffff";

    secondtext.style.color = "#000000";
    secondtext.style.backgroundColor = "#ffffff";
  }

  for_nav.forEach(element => {
    element.style.color = '#000000';
  });
}

/**dark mode  */
function moontoggle() {
  /** mobile */
  if (window.innerWidth < 1028) {
    x.style.backgroundColor = "#000000";
    theme.style.backgroundColor = " #ffffff";

    maintext.style.color = "#ffffff";
    maintext.style.backgroundColor = "#000000";

    secondtext.style.color = "#ffffff";
    secondtext.style.backgroundColor = "#000000";


    for_nav.forEach(element => {
       element.style.color= "#ffffff"
      });

  } else if (window.innerWidth > 1028) {
    /** desktop */
    x.style.backgroundColor = "#000000";
    theme.style.backgroundColor = " #ff0000";

    maintext.style.color = "#ffffff";
    maintext.style.backgroundColor = "#000000";

    secondtext.style.color = "#ffffff";
    secondtext.style.backgroundColor = "#000000";


    for_nav.forEach(element => {
        element.style.color= "#000000"
       });
  }
}




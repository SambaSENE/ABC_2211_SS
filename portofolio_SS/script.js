let menuVisible = false;
function mostrarOcultarMenu(){
    if(menuVisible){
        document.getElementById("nav").classList ="";
        menuVisible = false;
    }else{
        document.getElementById("nav").classList ="responsive";
        menuVisible = true;
    }
}

function selection(){
    document.getElementById("nav").classList = "";
    menuVisible = false;
}
function efectHabilidades(){
    var skills = document.getElementById("skills");
    var distancie_skills = window.innerHeight - skills.getBoundingClientRect().top;
    if(distancie_skills >= 300){
        let disc = document.getElementsByClassName("progress");
        disc[0].classList.add("javascript");
        disc[1].classList.add("htmlcss");
        disc[2].classList.add("photoshop");
        disc[3].classList.add("wordpress");
        disc[4].classList.add("drupal");
        disc[5].classList.add("comunicacion");
        disc[6].classList.add("trabajo");
        disc[7].classList.add("creatividad");
        disc[8].classList.add("dedicacion");
        disc[9].classList.add("proyect");
    }
}


window.onscroll = function(){
    efectHabilidades();
} 
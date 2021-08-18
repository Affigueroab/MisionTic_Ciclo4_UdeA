const menu = document.querySelector('.menu')
const navegacion = document.querySelector('.menu-navegacion')

menu.addEventListener('click', ()=>{
    navegacion.classList.toggle('extender')
})

window.addEventListener('click', e=>{
    console.log(e.target)
    if(navegacion.classList.contains('extender') && e.target != navegacion && e.target != menu){
        navegacion.classList.toggle('extender')
    }
})

import style from './Button.module.css'

function Button({text, children}) {
      return (
           <button className={style.button}>
                 {text}
                 {children}
           </button>
      );
}

export default Button;
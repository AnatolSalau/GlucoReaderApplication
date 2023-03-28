import style from './Button.module.css'

function Button({text, children}) {
      return (
           <button className={style.button}>
                 <div>
                       {text}
                 </div>

                 {children}
           </button>
      );
}

export default Button;
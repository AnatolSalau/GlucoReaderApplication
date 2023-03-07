import style from './Input.module.css'

function Input({textInFront}) {
      return (
            <div className={style.input}>
                  {textInFront}
                  <input/>
            </div>
      );
}

export default Input;
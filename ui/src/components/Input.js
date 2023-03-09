import { FaUserPlus } from 'react-icons/fa' ;
import style from './Input.module.css'

function Input({textInFront, placeholderText, children}) {
      return (
            <div className={style.input}>
                  {textInFront}
                  <div className={style.inputWrapper}>
                        <input placeholder={placeholderText} />
                        {children}
                  </div>
            </div>
      );
}

export default Input;
import { FaUserPlus } from 'react-icons/fa' ;
import style from './Input.module.css'

function Input({textInFront, placeholderText, children, inputWidth}) {
      return (
            <div style={{width: inputWidth}}>
                  <div className={style.input}>
                        {textInFront}
                        <div className={style.inputWrapper}>
                              <input
                                    placeholder={placeholderText}
                              />
                              <div className={style.svgWrapper}>
                                    {children}
                              </div>

                        </div>
                  </div>
            </div>

      );
}

export default Input;
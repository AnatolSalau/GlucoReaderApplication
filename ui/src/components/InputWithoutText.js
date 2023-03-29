import { FaUserPlus } from 'react-icons/fa' ;
import style from './InputWithoutText.module.css'

function InputWithoutText({placeholderText, children, inputWidth}) {
      return (
            <div style={{width: inputWidth}}>
                  <div className={style.input}>
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

export default InputWithoutText;
import style from "./Title.module.css"
import titleLogo from '../png/titleLogo.png';

function Title({text}) {
      return (
            <div className={style.title}>
                  <img src={titleLogo} alt="title"/>
                  {text}
            </div>
      );
}

export default Title;
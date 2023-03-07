import style from './NavigationLeftBar.module.css'
import Button from "./Button";

function NavigationLefBar() {
      return (
            <div className={style.navigationLeftbar}>
                  <Button text="One"/>
                  <Button text="Two"/>
                  <Button text="Three"/>
                  <Button text="Four"/>
                  <Button text="Five"/>
                  <Button text="Six"/>
            </div>
      );
}

export default NavigationLefBar;
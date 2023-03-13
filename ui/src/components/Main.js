import style from './Main.module.css'
import AllPatientsWindow from "./AllPatientsWindow/AllPatientsWindow";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";

function Main() {
      return (
            <div className={style.main}>
                  <NavigationLefBar />
                  <AllPatientsWindow />
            </div>
      )
}
export default Main;
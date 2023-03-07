import style from './Main.module.css'
import AllPatients from "./AllPatients/AllPatients";
import NavigationLefBar from "./NavigationLeftBar/NavigationLefBar";

function Main() {
      return (
            <div className={style.main}>
                  <NavigationLefBar />
                  <AllPatients />
            </div>
      )
}
export default Main;
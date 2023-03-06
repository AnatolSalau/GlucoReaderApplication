import style from './Main.module.css'
import NavigationLefBar from "./NavigationLefBar";
import AllPatients from "./AllPatients/AllPatients";

function Main() {
      return (
            <div className={style.main}>
                  <NavigationLefBar />
                  <AllPatients />
            </div>
      )
}
export default Main;
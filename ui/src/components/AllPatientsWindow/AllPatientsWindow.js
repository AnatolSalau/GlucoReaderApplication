import style from './AllPatientsWindow.module.css'
import AllPatientsTable from "./AllPatientsTable";
import AllPatientsNavBar from "./AllPatientsNavBar";

function AllPatientsWindow() {
      return (
            <div className={style.allPatients}>
                  <AllPatientsNavBar />
                  <AllPatientsTable />
            </div>
      );
}

export default AllPatientsWindow;
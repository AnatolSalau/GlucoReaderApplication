import style from './AllPatients.module.css'
import AllPatientsTable from "./AllPatientsTable";
import AllPatientsNavBar from "./AllPatientsNavBar";

function AllPatients() {
      return (
            <div className={style.allPatients}>
                  <AllPatientsNavBar />
                  <AllPatientsTable />
            </div>
      );
}

export default AllPatients;
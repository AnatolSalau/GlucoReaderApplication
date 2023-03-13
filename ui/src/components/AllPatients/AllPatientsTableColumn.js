import style from "./AllPatientsTable.module.css";
import allPatients from "../../data/allPatients.json";

function AllPatientsTableColumn({columnHeaderKey, columnHeaderValue }) {
      return (
            <div className={style.column}>
                  <div
                        className={style.columnHeader}
                  >
                        {columnHeaderValue}
                  </div>
                  {
                        allPatients.map((patient, index) => {
                              return (
                                    <div
                                          className={style.columnRow}
                                          key={index}
                                    >
                                          {patient[columnHeaderKey]}
                                    </div>
                              )
                        })
                  }
            </div>
      );
}

export default AllPatientsTableColumn;
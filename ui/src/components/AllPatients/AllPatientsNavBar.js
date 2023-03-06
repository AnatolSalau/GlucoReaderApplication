import style from './AllPatientsNavBar.module.css'

function AllPatientsNavBar() {
      return (
            <div className={style.allPatientsNavBar}>
                  Врач:
                  <input className={style.input}/>
                  <button className={style.button}>
                        Добавить пациента
                  </button>
                  <input className={style.input}/>
            </div>
      )
}

export default AllPatientsNavBar;
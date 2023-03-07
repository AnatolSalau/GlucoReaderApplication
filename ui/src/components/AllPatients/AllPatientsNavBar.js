import style from './AllPatientsNavBar.module.css'
import Input from "../Input";
import Button from "../Button";

function AllPatientsNavBar() {
      return (
            <div className={style.allPatientsNavBar}>
                  <Input textInFront="Врач:" />
                  <Button text="Добавить пациента">
                        Добавить пациента
                  </Button>
                  <Input textInFront="Text" />
            </div>
      )
}

export default AllPatientsNavBar;
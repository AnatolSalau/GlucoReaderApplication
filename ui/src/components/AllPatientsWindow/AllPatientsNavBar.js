import { FaUserPlus } from 'react-icons/fa' ;
import { ImSearch } from 'react-icons/im'
import { VscTriangleDown } from 'react-icons/vsc'

import style from './AllPatientsNavBar.module.css'
import Input from "../Input";
import Button from "../Button";

function AllPatientsNavBar() {
      return (
            <div className={style.allPatientsNavBar}>
                  <Input
                        className
                        textInFront="Врач"
                        placeholderText="Фамилия Имя Отчество"
                  >
                        <VscTriangleDown />
                  </Input>
                  <Button text="Добавить пациента">
                        <FaUserPlus />
                  </Button>
                  <Input
                        placeholderText="Поиск..."
                  >
                        <ImSearch />
                  </Input>
            </div>
      )
}

export default AllPatientsNavBar;
import style from './PieСhartCard.module.css'
import PieChart from "../PieChart/PieChart";

function PieChartCard() {
      return (
            <div
                  className={style.chartWrapper}
            >
                  <PieChart />
            </div>
      )
}

export default PieChartCard;
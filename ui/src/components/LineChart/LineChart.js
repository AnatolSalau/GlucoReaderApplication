import style from './LineChart.module.css'

import {Bar} from 'react-chartjs-2';
import Chart from 'chart.js/auto';

function LineChart() {
      const state = {
            labels: ['North America', 'South America', 'Asia',
                  'Europe', 'Africa', 'Australia'],
            datasets: [
                  {
                        label: 'Land area',
                        backgroundColor: 'rgba(175,25,192,1)',
                        borderColor: 'rgba(0,20,0,1)',
                        borderWidth: 2,
                        data: [16, 12, 1, 1, 1, 1]
                  }
            ]
      }
      return (
            <div className={style.lineChart}>
                  New Line Chart
                  <Bar
                        data={state}
                        options={{
                              title:{
                                    display:true,
                                    text:'Percentage of Land Area (from Enchanted Learning)',
                                    fontSize:20
                              },
                              legend:{
                                    display:true,
                                    position:'right'
                              }
                        }}
                  />
            </div>
      );
}

export default LineChart;
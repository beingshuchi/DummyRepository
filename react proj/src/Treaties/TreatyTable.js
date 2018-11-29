import React from 'react';
import PropTypes from 'prop-types';
import './table.css';
import {DataTable} from 'primereact/components/datatable/DataTable';
import {Column} from 'primereact/components/column/Column';
import {Header} from './Header';
import {TableService} from './TableService';
export default class TreatyTable extends React.Component{
    constructor(props){
        super(props);
        
        this.state = {
            data:[],
            sort: 0,
            field:""
        };
        this.tableService= new TableService();
        this.sortAsc=this.sortAsc.bind(this);
        this.sortDesc=this.sortDesc.bind(this);
    }

 
    componentDidMount(){
        this.tableService.getSampleData().then(data=>this.setState({datas:data}));
    }

    sortAsc(field){
        console.log("Hello");
        this.setState({
            field:field,
            sort: 1
          },()=>{console.log(field)});
          
          
    }
    sortDesc(field){
        this.setState({
            field:field,
            sort: -1
          });
    }
   
    render(){
        
        const columns = [
            {field: 'ledger', header: (<Header field="ledger" header='Ledger' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'ledgerName', header: (<Header field="ledgerName"  header='Ledger Name' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'uwUnit', header: (<Header  field="uwUnit" header='UW Unit' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'credentNo', header: (<Header field="credentNo" header='Credent No' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'credentName', header: (<Header field="credentName"  header='Credent Name' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'treatyNo', header: (<Header field="treatyNo" header='Treaty No' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'treatyName', header: (<Header field="treatyName"  header='Treaty Name' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'lastUWY', header: (<Header field="lastUWY" header='Last UWY' asc={this.sortAsc} desc={this.sortDesc}/>)},
            {field: 'status', header: (<Header field='status' header='Status' asc={this.sortAsc} desc={this.sortDesc}/>)}
        ];
        
        const dynamicColumns = columns.map((col) => {
           
        return (
            
        <Column key={col.field} field={col.field} header={col.header}/>
        
        );
        });
        let filtered = columns.filter(item => {
            return (
              item.field == this.props.filter?item.field:"No data found"
            );
          });
        return (
            <div>
               
                <DataTable sortOrder={this.state.sort} onFilter={()=>{this.setState({data:filtered})}} onSort={(e)=>{this.setState({sort:e.sortOrder})}} sortField={this.state.field} ref={(el) => this.dt = el} value={this.state.datas} paginator={true} rows={5}>
                {dynamicColumns}
                   
                 
               
                </DataTable>
                
            </div>
        );
    }
}

TreatyTable.prototypes ={
    ledger : PropTypes.string.isRequired,
    ledgerName :  PropTypes.string.isRequired,
    uwUnit:  PropTypes.number.isRequired,
    cedentNo:  PropTypes.number.isRequired,
    cedentName:  PropTypes.string.isRequired,
    treatyNo:  PropTypes.number.isRequired,
    treatyName:  PropTypes.string.isRequired,
    lastUWY:  PropTypes.number.isRequired,
    status:  PropTypes.string.isRequired
};
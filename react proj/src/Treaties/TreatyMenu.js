import React, {Component} from 'react';
import Dropdown from 'react-dropdown';


export class TreatyMenu extends Component {
    constructor(){
        super();
        this.state={
            filter:'',
            status:null
        };
        this.handleClickAsc=this.handleClickAsc.bind(this);
        this.handleClickDesc=this.handleClickDesc.bind(this);
        this.onStatusChange=this.onStatusChange.bind(this);
      
    }
    handleClickAsc(){
        this.props.asc(this.props.field);
    }
    handleClickDesc(){
        this.props.desc(this.props.field);
    }
    onStatusChange=(e)=>{
        const statusChange=e.value;
        this.setState({
            status: statusChange
            //status:e
        });
    }
  
   
    render() {
        
        const statusArr = [
            { label : 'Study', value: 'study'},
            { label : 'Finalized', value: 'finalized'},
            { label : 'Prospect', value: 'prospect'},
            { label : 'To Validate', value: 'To Validate'},
            { label : 'Authorized', value: 'authorized'},
            { label : 'Renewed', value: 'renewed'},
            { label : 'accepted', value: 'accepted'},
            { label : 'All', value: ''}
            ];
        return (
            <div>

  <h6>Sort</h6>
    <div className="p-grid">
        <div className="p-col-12 p-md-6">
            <button pbutton="true" className="a1" label="Ascending" onClick={this.handleClickAsc} >Ascending
            </button>
        </div>
        <div className="p-col-12 p-md-6">
            <button pbutton="true" className="a1" label="Descending" onClick={this.handleClickDesc}>Descending
            </button>
        </div>

    </div>

    <h6>Filter</h6>
    {this.props.field==='status'? <Dropdown className="b4" value={this.state.status} options={statusArr} onChange={this.onStatusChange} placeholder="Select"/>: <input id="search" className="in" onInput={(e) => this.setState({filter: e.target.value})} placeholder="Filter"  size="10" />}
  

   
</div>
        );
    }
}
    
import React from 'react';
import {TreatyMenu} from './TreatyMenu';
import {OverlayPanel} from 'primereact/components/overlaypanel/OverlayPanel';
import {Button} from 'primereact/components/button/Button';

export class Header extends React.Component{
   
  
    render(){
       
        return(
            <div>
              {/* {this.props.header}
            
            <select id="menu">
            <TreatyMenu field={this.props.field} />  
        </select>
        */ }
        <Button id="menu" type="button" label={this.props.header} onClick={(e) => this.op.toggle(e)} iconPos="right" icon="fa fa-caret-down" />
        <OverlayPanel ref={(el) => this.op = el} appendTo={document.body}>
       <TreatyMenu field={this.props.field} asc={this.props.asc} desc={this.props.desc}/>
      </OverlayPanel>
            </div>
        );
    }

}
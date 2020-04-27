package com.liuyao.old;

/**
 * @author liuyao
 * @date 2018/08/04
 */
public class Mediator extends AbstractMediator{

    @Override
    public void getPartner(Person person){
        if (person instanceof Man){
            this.setMan((Man) person);
        }else {
            this.setWoman((Woman) person);
        }

        if (super.getMan() == null || super.getWoman() == null){
            System.out.println("性别相同");
        }else {
            if (super.getMan().getAge() == super.getWoman().getAge()){
                System.out.println(super.getMan().getName() + " 和 " + super.getWoman().getName() + " 相配");
            }else {
                System.out.println(super.getMan().getName() + " 和 " + super.getWoman().getName() + " 不相配");
            }
        }
    }
}

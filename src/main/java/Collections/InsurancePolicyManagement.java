package Collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Policy {
    int policy_number;
    String holder_name;
    LocalDate date; //= LocalDate.parse("2015-10-21");
    String coverage_type;
    double premium_amount;

    Policy(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount) {
        this.policy_number = policy_number;
        this.holder_name = holder_name;
        this.date = date;
        this.coverage_type = coverage_type;
        this.premium_amount = premium_amount;
    }
}

    class AddPolicies{

        public void hashSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount){
            HashSet<Policy> policies = new HashSet<>();
            policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
        }

        public void treeSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount){
            TreeSet<Policy> policies = new TreeSet<>();
            policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
        }

        public void linkedHashSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount){
            LinkedHashSet<Policy> policies = new LinkedHashSet<>();
            policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
        }
    }

    class retrievePolicies{
        public void allUniquePolicies(){

        }
    }




public class InsurancePolicyManagement {
    public static void main(String[] args){
        AddPolicies policy = new AddPolicies();
        policy.hashSet(101,"akhil",LocalDate.parse("2026-10-30"),"home",100000);
        policy.hashSet(102,"charan",LocalDate.parse("2026-11-21"),"car",200000);


    }
}

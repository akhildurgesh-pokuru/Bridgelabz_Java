
/*
 * This program manages insurance policy details using Java Set collections.
 * It demonstrates creating policies and adding them using HashSet, TreeSet, and LinkedHashSet.
 */

package Collections;

import java.time.LocalDate;
import java.util.*;

// Stores the details of an insurance policy.
class Policy {
    int policy_number;
    String holder_name;
    LocalDate date; //= LocalDate.parse("2015-10-21");
    String coverage_type;
    double premium_amount;

    // Initializes the policy with the given details.
    Policy(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount) {
        this.policy_number = policy_number;
        this.holder_name = holder_name;
        this.date = date;
        this.coverage_type = coverage_type;
        this.premium_amount = premium_amount;
    }
}

// Adds insurance policies using different types of Set collections.
class AddPolicies {

    // Stores a policy in a HashSet.
    public void hashSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount) {
        HashSet<Policy> policies = new HashSet<>();
        policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
    }

    // Stores a policy in a TreeSet, which maintains sorted order.
    public void treeSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount) {
        TreeSet<Policy> policies = new TreeSet<>();
        policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
    }

    // Stores a policy in a LinkedHashSet, which preserves insertion order.
    public void linkedHashSet(int policy_number, String holder_name, LocalDate date, String coverage_type, double premium_amount) {
        LinkedHashSet<Policy> policies = new LinkedHashSet<>();
        policies.add(new Policy(policy_number, holder_name, date, coverage_type, premium_amount));
    }
}

// Intended to retrieve unique insurance policies.
class retrievePolicies {
    public void allUniquePolicies() {

    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {

        // Creates an object to access the policy-adding methods.
        AddPolicies policy = new AddPolicies();

        // Adds two sample insurance policies using HashSet.
        policy.hashSet(101,"akhil",LocalDate.parse("2026-10-30"),"home",100000);
        policy.hashSet(102,"charan",LocalDate.parse("2026-11-21"),"car",200000);

    }
}

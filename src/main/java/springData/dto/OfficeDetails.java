package springData.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class OfficeDetails {
    @Max(value = 50000, message = "4")
    @Min(value = 10000, message = "4")
    @NotNull(message = "6")
    private BigDecimal target;

    @Max(value = 50000, message = "5")
    @Min(value = 10000, message = "5")
    @NotNull(message = "6")
    private BigDecimal sales;

    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "OfficeDetails{" +
                "target=" + target +
                ", sales=" + sales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeDetails that = (OfficeDetails) o;
        return Objects.equals(target, that.target) &&
                Objects.equals(sales, that.sales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, sales);
    }
}

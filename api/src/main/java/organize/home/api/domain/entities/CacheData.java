package organize.home.api.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Getter
@Accessors(chain = true)
@RedisHash("cacheData")
public class CacheData 
{
    @Id
    private Integer id;
    private String productName;
    private Float priceUnd;
    private Integer quantityBought;
}

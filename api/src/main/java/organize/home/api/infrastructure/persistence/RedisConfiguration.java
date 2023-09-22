package organize.home.api.infrastructure.persistence;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import organize.home.api.domain.entities.CacheData;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration 
{
    @Value("${spring.data.redis.host}")
    private String redisHost;

    @Value("${spring.data.redis.port}")
    private int redisPort;

    @Value("${spring.data.redis.password}")
    private String password;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
      RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(redisHost, redisPort);
      configuration.setPassword(password);
      return new LettuceConnectionFactory(configuration);
    }

    @Bean
    RedisTemplate<String, CacheData> redisTemplate() {
      RedisTemplate<String, CacheData> redisTemplate = new RedisTemplate<>();
      redisTemplate.setConnectionFactory(redisConnectionFactory());
      return redisTemplate;
    }
}
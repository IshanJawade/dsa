package leetcode.medium;

import java.util.*;

public class implement_router {
	
	class Packet{
		int source;
		int destination;
		int timestamp;

		public Packet(int src, int des, int time){
			this.source = src;
			this.destination = des;
			this.timestamp = time;
		}
	}

	class Router {

		// Queue to store packets
		Queue<String> q;
		Map<String, int[]> map;
		Map<Integer, List<Integer>> time;
		int limit;

		public Router(int memoryLimit) {
			limit = memoryLimit;
			q = new ArrayDeque<>(memoryLimit);
			map = new HashMap<>(memoryLimit);
			time = new HashMap<>(memoryLimit);
		}
		
		public boolean addPacket(int source, int destination, int timestamp) {

			Packet packet = new Packet(source, destination, timestamp);
			String key = encode(packet);
			
			if(map.containsKey(key)){
				return false;
			}
			
			int[] data = new int[3];
			data[0] = packet.source;
			data[1] = packet.destination;
			data[2] = packet.timestamp;
			
			time.putIfAbsent(packet.destination, new ArrayList<>());
			
			// if goes out of memory limit poll the queue
			if(q.size() == limit){
				q.poll();
			} 
	
			q.offer(key);
			map.put(key, data);
			time.get(packet.destination).add(packet.timestamp);
			return true;
		}
		
		public int[] forwardPacket() {
			if(q.isEmpty()) return new int[0];

			String str = q.poll();

			return map.remove(str);
		}
		
		public int getCount(int destination, int startTime, int endTime) {
			int count = 0;

			List<Integer> list = time.get(destination);

			if(list == null || list.isEmpty())
            return 0;

			for(int i: list){
				if(i >= startTime && i <= endTime){
					count++;
				}
			}
			
			return count;
		}

		public String encode(Packet pac){
			String str = pac.source +"_"+ pac.destination + "_" + pac.timestamp;
			return str;
		} 
	}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */

}

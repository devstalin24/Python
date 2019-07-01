def solution():
    test_case =  int(input())
    for i in range(0,test_case):
        number = int(input())
        enemy_energy = input()
        player_strength = input()
        enemy =  enemy_energy.split(" ")
        player = player_strength.split(" ")
        for k in range(0,number):
            player[k] = int(player[k])
            enemy[k] = int(enemy[k])    
        player.sort()
        enemy.sort()
        print(enemy)
        print(player)
        for q in range(0,number):
            if enemy[q] > player[q]:
                return False
        return True

print(solution())

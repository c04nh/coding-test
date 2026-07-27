def solution(players, callings):
    rank = {player: i for i, player in enumerate(players)}

    for c in callings:
        w = rank[c] - 1
        l = rank[c]
        players[w], players[l] = players[l], players[w]
        rank[players[w]], rank[players[l]] = w, l

    return players
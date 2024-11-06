//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: LTCUSDT_15Min_2BT0_1cd0fc71 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2BT0_1cd0fc71", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_1cd0fc71(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.779121 )
		if( bbm <= 2.05658 )
			if( ema3 <= 100.493 )
				if( ema12 <= -0.299363 )
					if( tema <= 89.1441 )
						if( tema <= 88.8581 )
							if( tema <= 56.4578 )
								if( ema1 <= 53.6724 )
									ret := 0.204412
								if( ema1 > 53.6724 )
									ret := -0.122931
							if( tema > 56.4578 )
								if( ema1 <= 80.1043 )
									ret := 0.262667
								if( ema1 > 80.1043 )
									ret := 0.149308
						if( tema > 88.8581 )
							if( bbm <= 0.43 )
								if( ema13 <= -1.09113 )
									ret := 0.000000
								if( ema13 > -1.09113 )
									ret := 0.750000 // buy
							if( bbm > 0.43 )
								if( bullPower <= -0.573046 )
									ret := -0.500000
								if( bullPower > -0.573046 )
									ret := -0.956522 // sell
					if( tema > 89.1441 )
						if( ema13 <= -0.946513 )
							if( bearPower <= -3.73978 )
								if( ema2 <= 94.4918 )
									ret := -1.000000 // sell
								if( ema2 > 94.4918 )
									ret := 0.250000
							if( bearPower > -3.73978 )
								if( ema13 <= -3.22016 )
									ret := -0.400000
								if( ema13 > -3.22016 )
									ret := 0.642127
						if( ema13 > -0.946513 )
							if( bearPower <= -1.07131 )
								if( ema3 <= 96.2748 )
									ret := -0.018182
								if( ema3 > 96.2748 )
									ret := 0.421622
							if( bearPower > -1.07131 )
								if( tema <= 93.443 )
									ret := 0.592417
								if( tema > 93.443 )
									ret := 0.246753
				if( ema12 > -0.299363 )
					if( bearPower <= -0.892401 )
						if( bearPower <= -1.40276 )
							if( bbp <= -1.78781 )
								if( ema2 <= 91.6912 )
									ret := -0.210526
								if( ema2 > 91.6912 )
									ret := 0.769231 // buy
							if( bbp > -1.78781 )
								if( ema12 <= -0.26402 )
									ret := 0.275000
								if( ema12 > -0.26402 )
									ret := 0.722222 // buy
						if( bearPower > -1.40276 )
							if( bullPower <= 0.18573 )
								if( ema13 <= -0.467264 )
									ret := -0.053571
								if( ema13 > -0.467264 )
									ret := 0.251818
							if( bullPower > 0.18573 )
								if( ema2 <= 77.8033 )
									ret := 0.045455
								if( ema2 > 77.8033 )
									ret := -0.689655
					if( bearPower > -0.892401 )
						if( ema3 <= 53.9073 )
							if( ema2 <= 45.8951 )
								if( bbm <= 0.396909 )
									ret := 1.000000 // buy
								if( bbm > 0.396909 )
									ret := -0.625000
							if( ema2 > 45.8951 )
								if( bbm <= 0.781096 )
									ret := 0.513761
								if( bbm > 0.781096 )
									ret := -0.571429
						if( ema3 > 53.9073 )
							if( tema <= 53.8317 )
								if( ema2 <= 54.0117 )
									ret := 0.000000
								if( ema2 > 54.0117 )
									ret := -0.812500 // sell
							if( tema > 53.8317 )
								if( ema13 <= 0.177345 )
									ret := 0.062262
								if( ema13 > 0.177345 )
									ret := -0.541667
			if( ema3 > 100.493 )
				if( ema3 <= 101.199 )
					if( ema3 <= 100.917 )
						if( ema12 <= -0.790288 )
							if( ema12 <= -0.972264 )
								ret := -0.833333 // sell
							if( ema12 > -0.972264 )
								if( ema13 <= -1.39556 )
									ret := 1.000000 // buy
								if( ema13 > -1.39556 )
									ret := 0.200000
						if( ema12 > -0.790288 )
							if( ema12 <= -0.519962 )
								ret := -1.000000 // sell
							if( ema12 > -0.519962 )
								if( ema2 <= 100.675 )
									ret := -0.304348
								if( ema2 > 100.675 )
									ret := 0.333333
					if( ema3 > 100.917 )
						if( bbp <= -1.24768 )
							if( bullPower <= -0.499951 )
								if( ema12 <= -0.372756 )
									ret := -0.866667 // sell
								if( ema12 > -0.372756 )
									ret := -0.250000
							if( bullPower > -0.499951 )
								ret := -1.000000 // sell
						if( bbp > -1.24768 )
							if( bbm <= 0.404387 )
								ret := -1.000000 // sell
							if( bbm > 0.404387 )
								if( ema3 <= 101.12 )
									ret := 0.142857
								if( ema3 > 101.12 )
									ret := -0.500000
				if( ema3 > 101.199 )
					if( ema2 <= 101.916 )
						if( ema1 <= 99.8029 )
							if( bbp <= -2.99077 )
								if( bbm <= 0.85 )
									ret := 0.750000 // buy
								if( bbm > 0.85 )
									ret := 0.250000
							if( bbp > -2.99077 )
								if( ema13 <= -2.54563 )
									ret := -1.000000 // sell
								if( ema13 > -2.54563 )
									ret := -0.400000
						if( ema1 > 99.8029 )
							if( ema1 <= 100.717 )
								if( ema13 <= -1.21133 )
									ret := 0.727273 // buy
								if( ema13 > -1.21133 )
									ret := 0.968750 // buy
							if( ema1 > 100.717 )
								if( ema13 <= -0.594257 )
									ret := -0.090909
								if( ema13 > -0.594257 )
									ret := 0.682927
					if( ema2 > 101.916 )
						if( ema13 <= -0.148045 )
							if( bearPower <= -0.962583 )
								if( tema <= 101.897 )
									ret := -0.411765
								if( tema > 101.897 )
									ret := 0.073892
							if( bearPower > -0.962583 )
								if( ema3 <= 102.456 )
									ret := 0.384615
								if( ema3 > 102.456 )
									ret := -0.475806
						if( ema13 > -0.148045 )
							if( ema2 <= 102.397 )
								if( bullPower <= -0.156612 )
									ret := -0.750000 // sell
								if( bullPower > -0.156612 )
									ret := -1.000000 // sell
							if( ema2 > 102.397 )
								if( bbm <= 0.736072 )
									ret := -0.200000
								if( bbm > 0.736072 )
									ret := 0.844444 // buy
		if( bbm > 2.05658 )
			if( ema3 <= 100.061 )
				if( ema13 <= -0.291467 )
					if( ema13 <= -4.12668 )
						if( ema1 <= 78.2961 )
							ret := 1.000000 // buy
						if( ema1 > 78.2961 )
							ret := 0.571429
					if( ema13 > -4.12668 )
						if( tema <= 62.7808 )
							if( tema <= 55.0467 )
								ret := 1.000000 // buy
							if( tema > 55.0467 )
								if( bearPower <= -3.01325 )
									ret := 0.227273
								if( bearPower > -3.01325 )
									ret := -0.750000 // sell
						if( tema > 62.7808 )
							if( tema <= 87.8278 )
								if( bbp <= -4.68224 )
									ret := 0.870130 // buy
								if( bbp > -4.68224 )
									ret := 0.608696
							if( tema > 87.8278 )
								if( ema3 <= 96.2317 )
									ret := 0.122449
								if( ema3 > 96.2317 )
									ret := 0.804878 // buy
				if( ema13 > -0.291467 )
					if( ema2 <= 91.9537 )
						if( bbp <= -2.47609 )
							if( bullPower <= -0.127637 )
								ret := -1.000000 // sell
							if( bullPower > -0.127637 )
								ret := -0.500000
						if( bbp > -2.47609 )
							if( bbp <= -1.43774 )
								if( ema12 <= -0.095634 )
									ret := 1.000000 // buy
								if( ema12 > -0.095634 )
									ret := 0.750000 // buy
							if( bbp > -1.43774 )
								if( bbm <= 2.27335 )
									ret := 0.285714
								if( bbm > 2.27335 )
									ret := -0.750000 // sell
					if( ema2 > 91.9537 )
						if( ema13 <= 0.208607 )
							ret := 0.750000 // buy
						if( ema13 > 0.208607 )
							ret := 1.000000 // buy
			if( ema3 > 100.061 )
				if( bbp <= -3.03803 )
					if( bbp <= -4.8611 )
						if( ema13 <= -2.21097 )
							ret := -0.500000
						if( ema13 > -2.21097 )
							ret := 0.200000
					if( bbp > -4.8611 )
						if( bbp <= -4.32509 )
							ret := 0.750000 // buy
						if( bbp > -4.32509 )
							ret := 1.000000 // buy
				if( bbp > -3.03803 )
					if( bearPower <= -2.26618 )
						if( ema12 <= -0.507052 )
							ret := -0.750000 // sell
						if( ema12 > -0.507052 )
							ret := -1.000000 // sell
					if( bearPower > -2.26618 )
						ret := 0.166667
	if( bbp > -0.779121 )
		if( ema1 <= 92.1006 )
			if( bearPower <= -0.204782 )
				if( tema <= 68.9858 )
					if( ema12 <= -0.378356 )
						if( ema2 <= 60.5715 )
							if( ema13 <= -0.975513 )
								if( ema3 <= 51.9305 )
									ret := 0.000000
								if( ema3 > 51.9305 )
									ret := -1.000000 // sell
							if( ema13 > -0.975513 )
								if( ema13 <= -0.941681 )
									ret := 0.600000
								if( ema13 > -0.941681 )
									ret := -0.705882 // sell
						if( ema2 > 60.5715 )
							if( ema3 <= 63.3951 )
								if( bullPower <= -0.028743 )
									ret := 0.000000
								if( bullPower > -0.028743 )
									ret := 0.937500 // buy
							if( ema3 > 63.3951 )
								if( ema3 <= 67.0402 )
									ret := -0.782609 // sell
								if( ema3 > 67.0402 )
									ret := 0.031250
					if( ema12 > -0.378356 )
						if( ema13 <= -0.438106 )
							if( tema <= 65.7481 )
								if( ema2 <= 64.0654 )
									ret := -0.025840
								if( ema2 > 64.0654 )
									ret := -0.414365
							if( tema > 65.7481 )
								if( bbp <= -0.16247 )
									ret := 0.404167
								if( bbp > -0.16247 )
									ret := -0.216216
						if( ema13 > -0.438106 )
							if( bearPower <= -0.37172 )
								if( bullPower <= -0.133175 )
									ret := 0.110991
								if( bullPower > -0.133175 )
									ret := 0.277238
							if( bearPower > -0.37172 )
								if( ema2 <= 61.3041 )
									ret := 0.181320
								if( ema2 > 61.3041 )
									ret := 0.058340
				if( tema > 68.9858 )
					if( tema <= 70.6207 )
						if( ema13 <= -0.532191 )
							if( ema1 <= 70.3812 )
								if( ema1 <= 69.9391 )
									ret := -0.304348
								if( ema1 > 69.9391 )
									ret := -0.828571 // sell
							if( ema1 > 70.3812 )
								if( bbm <= 0.255 )
									ret := 0.000000
								if( bbm > 0.255 )
									ret := 0.500000
						if( ema13 > -0.532191 )
							if( tema <= 70.4479 )
								if( ema13 <= -0.113737 )
									ret := 0.066461
								if( ema13 > -0.113737 )
									ret := -0.148862
							if( tema > 70.4479 )
								if( ema13 <= -0.246935 )
									ret := -0.805556 // sell
								if( ema13 > -0.246935 )
									ret := -0.324324
					if( tema > 70.6207 )
						if( ema2 <= 71.7523 )
							if( ema2 <= 71.5255 )
								if( ema2 <= 71.2736 )
									ret := 0.319149
								if( ema2 > 71.2736 )
									ret := -0.195946
							if( ema2 > 71.5255 )
								if( ema3 <= 71.5459 )
									ret := -0.074074
								if( ema3 > 71.5459 )
									ret := 0.538462
						if( ema2 > 71.7523 )
							if( tema <= 74.5451 )
								if( tema <= 73.0859 )
									ret := 0.051667
								if( tema > 73.0859 )
									ret := -0.176152
							if( tema > 74.5451 )
								if( tema <= 76.3825 )
									ret := 0.281124
								if( tema > 76.3825 )
									ret := 0.020320
			if( bearPower > -0.204782 )
				if( ema2 <= 43.9741 )
					if( bearPower <= 0.658023 )
						if( bullPower <= 0.830661 )
							if( tema <= 44.1084 )
								ret := 1.000000 // buy
							if( tema > 44.1084 )
								ret := -0.333333
						if( bullPower > 0.830661 )
							if( bullPower <= 1.55852 )
								ret := 1.000000 // buy
							if( bullPower > 1.55852 )
								ret := 0.750000 // buy
					if( bearPower > 0.658023 )
						ret := -0.500000
				if( ema2 > 43.9741 )
					if( ema3 <= 45.9018 )
						if( bearPower <= 0.881605 )
							if( ema2 <= 45.2333 )
								if( ema1 <= 44.625 )
									ret := -0.958333 // sell
								if( ema1 > 44.625 )
									ret := -0.102041
							if( ema2 > 45.2333 )
								if( ema2 <= 45.5573 )
									ret := -0.636364
								if( ema2 > 45.5573 )
									ret := -0.905660 // sell
						if( bearPower > 0.881605 )
							if( ema3 <= 45.0733 )
								if( ema2 <= 44.8639 )
									ret := 1.000000 // buy
								if( ema2 > 44.8639 )
									ret := -0.400000
							if( ema3 > 45.0733 )
								ret := 1.000000 // buy
					if( ema3 > 45.9018 )
						if( tema <= 50.978 )
							if( ema3 <= 46.4114 )
								if( ema12 <= 0.004088 )
									ret := -0.777778 // sell
								if( ema12 > 0.004088 )
									ret := 0.741176 // buy
							if( ema3 > 46.4114 )
								if( ema1 <= 47.3104 )
									ret := -0.789474 // sell
								if( ema1 > 47.3104 )
									ret := 0.169287
						if( tema > 50.978 )
							if( ema1 <= 91.7912 )
								if( ema2 <= 50.3267 )
									ret := -0.869565 // sell
								if( ema2 > 50.3267 )
									ret := 0.013672
							if( ema1 > 91.7912 )
								if( ema3 <= 91.7302 )
									ret := 0.522727
								if( ema3 > 91.7302 )
									ret := 0.141732
		if( ema1 > 92.1006 )
			if( tema <= 107.586 )
				if( ema3 <= 93.0921 )
					if( ema13 <= 0.576723 )
						if( ema1 <= 92.995 )
							if( bbm <= 0.349191 )
								if( ema2 <= 92.3067 )
									ret := -0.319372
								if( ema2 > 92.3067 )
									ret := 0.060046
							if( bbm > 0.349191 )
								if( ema13 <= -0.322583 )
									ret := -0.745098 // sell
								if( ema13 > -0.322583 )
									ret := -0.230435
						if( ema1 > 92.995 )
							if( ema3 <= 92.7018 )
								if( tema <= 93.3984 )
									ret := -0.038462
								if( tema > 93.3984 )
									ret := 0.812500 // buy
							if( ema3 > 92.7018 )
								if( bullPower <= 0.197613 )
									ret := -0.111111
								if( bullPower > 0.197613 )
									ret := -0.708609 // sell
					if( ema13 > 0.576723 )
						if( ema12 <= 1.98475 )
							if( bearPower <= 0.52735 )
								if( ema12 <= 0.384004 )
									ret := -0.066667
								if( ema12 > 0.384004 )
									ret := 0.447368
							if( bearPower > 0.52735 )
								if( ema13 <= 1.31803 )
									ret := -0.352273
								if( ema13 > 1.31803 )
									ret := 0.301587
						if( ema12 > 1.98475 )
							if( bearPower <= 2.76914 )
								ret := -1.000000 // sell
							if( bearPower > 2.76914 )
								ret := -0.750000 // sell
				if( ema3 > 93.0921 )
					if( ema13 <= 1.30756 )
						if( ema2 <= 102.008 )
							if( ema3 <= 101.277 )
								if( ema3 <= 101.083 )
									ret := -0.030599
								if( ema3 > 101.083 )
									ret := -0.457364
							if( ema3 > 101.277 )
								if( ema12 <= 0.420434 )
									ret := 0.447964
								if( ema12 > 0.420434 )
									ret := -0.615385
						if( ema2 > 102.008 )
							if( ema1 <= 105.674 )
								if( ema13 <= -0.27371 )
									ret := -0.618321
								if( ema13 > -0.27371 )
									ret := -0.200743
							if( ema1 > 105.674 )
								if( ema3 <= 107.176 )
									ret := 0.329787
								if( ema3 > 107.176 )
									ret := -0.477273
					if( ema13 > 1.30756 )
						if( ema2 <= 97.4012 )
							if( ema2 <= 94.3937 )
								if( bbm <= 0.645 )
									ret := 0.250000
								if( bbm > 0.645 )
									ret := -1.000000 // sell
							if( ema2 > 94.3937 )
								if( bbm <= 2.745 )
									ret := 0.792208 // buy
								if( bbm > 2.745 )
									ret := -0.500000
						if( ema2 > 97.4012 )
							if( ema12 <= 0.603471 )
								if( bullPower <= 0.973727 )
									ret := 0.750000 // buy
								if( bullPower > 0.973727 )
									ret := 1.000000 // buy
							if( ema12 > 0.603471 )
								if( ema1 <= 104.323 )
									ret := 0.154206
								if( ema1 > 104.323 )
									ret := -0.559322
			if( tema > 107.586 )
				if( ema3 <= 110.223 )
					if( bullPower <= 1.27955 )
						if( ema12 <= 0.672366 )
							if( ema1 <= 107.379 )
								if( bbm <= 0.901984 )
									ret := 1.000000 // buy
								if( bbm > 0.901984 )
									ret := -1.000000 // sell
							if( ema1 > 107.379 )
								if( bullPower <= 0.144556 )
									ret := 0.000000
								if( bullPower > 0.144556 )
									ret := -0.772727 // sell
						if( ema12 > 0.672366 )
							ret := 0.800000 // buy
					if( bullPower > 1.27955 )
						if( ema12 <= 0.673477 )
							if( ema2 <= 107.046 )
								if( ema3 <= 106.73 )
									ret := -1.000000 // sell
								if( ema3 > 106.73 )
									ret := -0.750000 // sell
							if( ema2 > 107.046 )
								ret := -1.000000 // sell
						if( ema12 > 0.673477 )
							if( ema13 <= 1.66999 )
								if( bbp <= 3.49092 )
									ret := -0.062500
								if( bbp > 3.49092 )
									ret := -0.900000 // sell
							if( ema13 > 1.66999 )
								if( ema3 <= 104.467 )
									ret := -1.000000 // sell
								if( ema3 > 104.467 )
									ret := -0.846154 // sell
				if( ema3 > 110.223 )
					if( ema2 <= 112.271 )
						if( bullPower <= 0.866708 )
							if( bbp <= -0.57923 )
								ret := 0.000000
							if( bbp > -0.57923 )
								if( ema12 <= -0.033205 )
									ret := 1.000000 // buy
								if( ema12 > -0.033205 )
									ret := 0.615385
						if( bullPower > 0.866708 )
							if( ema13 <= 0.341401 )
								ret := 0.142857
							if( ema13 > 0.341401 )
								if( ema1 <= 111.156 )
									ret := -1.000000 // sell
								if( ema1 > 111.156 )
									ret := -0.200000
					if( ema2 > 112.271 )
						if( bearPower <= -0.531017 )
							ret := 0.000000
						if( bearPower > -0.531017 )
							if( ema3 <= 112.956 )
								if( ema2 <= 112.697 )
									ret := -1.000000 // sell
								if( ema2 > 112.697 )
									ret := -0.857143 // sell
							if( ema3 > 112.956 )
								ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_LTCUSDT_15Min_1cd0fc71(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.



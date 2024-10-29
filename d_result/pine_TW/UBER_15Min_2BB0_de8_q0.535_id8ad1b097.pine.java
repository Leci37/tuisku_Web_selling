//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: UBER_15Min_2BB0_8ad1b097 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_2BB0_8ad1b097", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_8ad1b097(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= -0.08776 )
		if( bbp <= -0.996604 )
			if( Lower_Band <= 34.4875 )
				if( Upper_Band <= 35.0677 )
					if( bearPower <= -1.07772 )
						if( Upper_Band <= 30.6935 )
							if( bullPower <= -0.646323 )
								if( bullPower <= -0.773989 )
									ret := 0.140000
								if( bullPower > -0.773989 )
									ret := 0.871795 // buy
							if( bullPower > -0.646323 )
								if( bbp <= -1.85512 )
									ret := -0.851852 // sell
								if( bbp > -1.85512 )
									ret := 0.076923
						if( Upper_Band > 30.6935 )
							if( Upper_Band <= 34.4862 )
								if( bbp <= -2.06327 )
									ret := 1.000000 // buy
								if( bbp > -2.06327 )
									ret := 0.916667 // buy
							if( Upper_Band > 34.4862 )
								if( Lower_Band <= 32.5705 )
									ret := 0.750000 // buy
								if( Lower_Band > 32.5705 )
									ret := -0.363636
					if( bearPower > -1.07772 )
						if( bearPower <= -0.984786 )
							if( Lower_Band <= 25.8918 )
								if( Upper_Band <= 27.615 )
									ret := 0.222222
								if( Upper_Band > 27.615 )
									ret := 1.000000 // buy
							if( Lower_Band > 25.8918 )
								if( Lower_Band <= 28.7307 )
									ret := -1.000000 // sell
								if( Lower_Band > 28.7307 )
									ret := -0.333333
						if( bearPower > -0.984786 )
							if( bbm <= 0.66333 )
								if( Lower_Band <= 23.0108 )
									ret := 0.742188 // buy
								if( Lower_Band > 23.0108 )
									ret := 0.128843
							if( bbm > 0.66333 )
								if( Upper_Band <= 31.391 )
									ret := 0.942857 // buy
								if( Upper_Band > 31.391 )
									ret := 0.583333
				if( Upper_Band > 35.0677 )
					if( Lower_Band <= 33.5101 )
						if( Upper_Band <= 35.684 )
							if( bbp <= -1.33855 )
								ret := 1.000000 // buy
							if( bbp > -1.33855 )
								ret := 0.818182 // buy
						if( Upper_Band > 35.684 )
							ret := 0.727273 // buy
					if( Lower_Band > 33.5101 )
						if( basis <= 35.2642 )
							if( basis <= 34.8679 )
								ret := 0.000000
							if( basis > 34.8679 )
								if( bearPower <= -0.734523 )
									ret := 1.000000 // buy
								if( bearPower > -0.734523 )
									ret := 0.714286 // buy
						if( basis > 35.2642 )
							if( bullPower <= -0.575257 )
								ret := 0.777778 // buy
							if( bullPower > -0.575257 )
								ret := -0.200000
			if( Lower_Band > 34.4875 )
				if( Upper_Band <= 40.0514 )
					if( Upper_Band <= 38.6189 )
						if( bbp <= -1.11801 )
							if( bbm <= 0.269148 )
								if( bbp <= -1.29621 )
									ret := -0.153846
								if( bbp > -1.29621 )
									ret := -0.680000
							if( bbm > 0.269148 )
								if( basis <= 35.9866 )
									ret := -0.826087 // sell
								if( basis > 35.9866 )
									ret := 0.209302
						if( bbp > -1.11801 )
							if( basis <= 36.5857 )
								if( bearPower <= -0.6777 )
									ret := 0.777778 // buy
								if( bearPower > -0.6777 )
									ret := -0.200000
							if( basis > 36.5857 )
								if( Upper_Band <= 37.4881 )
									ret := 0.555556
								if( Upper_Band > 37.4881 )
									ret := 0.923077 // buy
					if( Upper_Band > 38.6189 )
						if( Upper_Band <= 39.1166 )
							if( bullPower <= -0.486381 )
								ret := 0.000000
							if( bullPower > -0.486381 )
								if( basis <= 37.0219 )
									ret := -0.200000
								if( basis > 37.0219 )
									ret := -0.944444 // sell
						if( Upper_Band > 39.1166 )
							if( Upper_Band <= 39.4539 )
								if( Upper_Band <= 39.2713 )
									ret := -0.869565 // sell
								if( Upper_Band > 39.2713 )
									ret := -0.977778 // sell
							if( Upper_Band > 39.4539 )
								if( bearPower <= -0.802486 )
									ret := -0.854167 // sell
								if( bearPower > -0.802486 )
									ret := -0.394737
				if( Upper_Band > 40.0514 )
					if( Lower_Band <= 79.1875 )
						if( bearPower <= -0.732758 )
							if( Lower_Band <= 74.6901 )
								if( bearPower <= -1.31442 )
									ret := -0.111857
								if( bearPower > -1.31442 )
									ret := 0.091902
							if( Lower_Band > 74.6901 )
								if( Upper_Band <= 82.046 )
									ret := 0.263158
								if( Upper_Band > 82.046 )
									ret := 0.939394 // buy
						if( bearPower > -0.732758 )
							if( Lower_Band <= 56.803 )
								if( Upper_Band <= 55.3298 )
									ret := 0.538194
								if( Upper_Band > 55.3298 )
									ret := 0.086957
							if( Lower_Band > 56.803 )
								if( basis <= 60.4175 )
									ret := -0.678571
								if( basis > 60.4175 )
									ret := 0.146667
					if( Lower_Band > 79.1875 )
						if( basis <= 81.1928 )
							ret := -0.714286 // sell
						if( basis > 81.1928 )
							ret := -0.928571 // sell
		if( bbp > -0.996604 )
			if( Lower_Band <= 21.8769 )
				if( basis <= 19.3292 )
					if( Upper_Band <= 18.6458 )
						if( bbp <= -0.684014 )
							ret := -0.466667
						if( bbp > -0.684014 )
							ret := -0.857143 // sell
					if( Upper_Band > 18.6458 )
						ret := -0.222222
				if( basis > 19.3292 )
					if( bbp <= -0.232088 )
						if( bbp <= -0.706574 )
							if( bearPower <= -0.578316 )
								ret := 0.866667 // buy
							if( bearPower > -0.578316 )
								if( Upper_Band <= 23.4818 )
									ret := 0.333333
								if( Upper_Band > 23.4818 )
									ret := -0.176471
						if( bbp > -0.706574 )
							if( Upper_Band <= 22.1632 )
								if( Upper_Band <= 21.6437 )
									ret := 0.847458 // buy
								if( Upper_Band > 21.6437 )
									ret := 0.360000
							if( Upper_Band > 22.1632 )
								if( bearPower <= -0.277332 )
									ret := 0.872093 // buy
								if( bearPower > -0.277332 )
									ret := 0.566667
					if( bbp > -0.232088 )
						ret := -0.176471
			if( Lower_Band > 21.8769 )
				if( Lower_Band <= 25.5915 )
					if( bbp <= -0.483456 )
						if( Lower_Band <= 22.6451 )
							if( bbm <= 0.391548 )
								if( Upper_Band <= 23.3323 )
									ret := 0.857143 // buy
								if( Upper_Band > 23.3323 )
									ret := -0.082353
							if( bbm > 0.391548 )
								ret := -0.909091 // sell
						if( Lower_Band > 22.6451 )
							if( Lower_Band <= 24.1462 )
								if( bbp <= -0.614165 )
									ret := -0.759740 // sell
								if( bbp > -0.614165 )
									ret := -0.485714
							if( Lower_Band > 24.1462 )
								if( Lower_Band <= 25.4111 )
									ret := -0.252252
								if( Lower_Band > 25.4111 )
									ret := -0.850000 // sell
					if( bbp > -0.483456 )
						if( Lower_Band <= 22.1847 )
							if( basis <= 22.4755 )
								ret := -0.954545 // sell
							if( basis > 22.4755 )
								ret := -0.352941
						if( Lower_Band > 22.1847 )
							if( Upper_Band <= 24.8508 )
								if( bullPower <= -0.135556 )
									ret := 0.800000 // buy
								if( bullPower > -0.135556 )
									ret := 0.229885
							if( Upper_Band > 24.8508 )
								if( Upper_Band <= 26.5199 )
									ret := -0.225166
								if( Upper_Band > 26.5199 )
									ret := 0.645161
				if( Lower_Band > 25.5915 )
					if( bbm <= 0.057005 )
						if( basis <= 28.4403 )
							if( Lower_Band <= 26.5591 )
								if( Lower_Band <= 25.9534 )
									ret := 0.857143 // buy
								if( Lower_Band > 25.9534 )
									ret := -0.437500
							if( Lower_Band > 26.5591 )
								if( basis <= 28.097 )
									ret := 0.411215
								if( basis > 28.097 )
									ret := 0.787234 // buy
						if( basis > 28.4403 )
							if( basis <= 28.9747 )
								if( basis <= 28.8211 )
									ret := -0.181818
								if( basis > 28.8211 )
									ret := -0.793103 // sell
							if( basis > 28.9747 )
								if( Upper_Band <= 29.6915 )
									ret := 0.613636
								if( Upper_Band > 29.6915 )
									ret := 0.157043
					if( bbm > 0.057005 )
						if( basis <= 26.8402 )
							if( basis <= 26.3857 )
								if( bullPower <= -0.157927 )
									ret := -1.000000 // sell
								if( bullPower > -0.157927 )
									ret := 0.742857 // buy
							if( basis > 26.3857 )
								if( bbp <= -0.663249 )
									ret := 0.166667
								if( bbp > -0.663249 )
									ret := 0.801980 // buy
						if( basis > 26.8402 )
							if( basis <= 75.4453 )
								if( bullPower <= -0.228688 )
									ret := 0.095326
								if( bullPower > -0.228688 )
									ret := 0.009870
							if( basis > 75.4453 )
								if( Lower_Band <= 78.5304 )
									ret := -0.188482
								if( Lower_Band > 78.5304 )
									ret := -0.582090
	if( bullPower > -0.08776 )
		if( bbp <= 0.454195 )
			if( Upper_Band <= 27.9035 )
				if( Lower_Band <= 19.2501 )
					if( bbp <= -0.432469 )
						ret := 1.000000 // buy
					if( bbp > -0.432469 )
						if( bbp <= -0.074694 )
							if( Lower_Band <= 17.0491 )
								if( bearPower <= -0.215685 )
									ret := 0.378378
								if( bearPower > -0.215685 )
									ret := -0.181818
							if( Lower_Band > 17.0491 )
								if( Upper_Band <= 19.8274 )
									ret := -1.000000 // sell
								if( Upper_Band > 19.8274 )
									ret := -0.650000
						if( bbp > -0.074694 )
							if( BBPower_Color <= 0.5 )
								ret := -0.666667
							if( BBPower_Color > 0.5 )
								ret := -1.000000 // sell
				if( Lower_Band > 19.2501 )
					if( Lower_Band <= 20.7182 )
						if( Lower_Band <= 20.4138 )
							if( bbm <= 0.08059 )
								if( BBPower_Color <= 0.5 )
									ret := 0.050000
								if( BBPower_Color > 0.5 )
									ret := -0.807692 // sell
							if( bbm > 0.08059 )
								if( bearPower <= 0.029451 )
									ret := 0.370370
								if( bearPower > 0.029451 )
									ret := -0.478261
						if( Lower_Band > 20.4138 )
							if( basis <= 21.3659 )
								if( bullPower <= 0.123731 )
									ret := 0.616438
								if( bullPower > 0.123731 )
									ret := 0.884211 // buy
							if( basis > 21.3659 )
								ret := -0.466667
					if( Lower_Band > 20.7182 )
						if( bullPower <= 0.222571 )
							if( Lower_Band <= 20.8482 )
								if( Upper_Band <= 21.6003 )
									ret := -0.131579
								if( Upper_Band > 21.6003 )
									ret := -0.854167 // sell
							if( Lower_Band > 20.8482 )
								if( bbp <= -0.381875 )
									ret := -0.243094
								if( bbp > -0.381875 )
									ret := 0.041924
						if( bullPower > 0.222571 )
							if( Lower_Band <= 26.4981 )
								if( basis <= 22.6328 )
									ret := 0.412955
								if( basis > 22.6328 )
									ret := -0.049451
							if( Lower_Band > 26.4981 )
								if( bbm <= 0.700518 )
									ret := 0.616740
								if( bbm > 0.700518 )
									ret := -1.000000 // sell
			if( Upper_Band > 27.9035 )
				if( Upper_Band <= 31.9705 )
					if( Lower_Band <= 31.1882 )
						if( Lower_Band <= 27.4477 )
							if( bbm <= 0.033302 )
								if( bullPower <= 0.103025 )
									ret := -0.882353 // sell
								if( bullPower > 0.103025 )
									ret := -0.571429
							if( bbm > 0.033302 )
								if( basis <= 27.977 )
									ret := -0.164467
								if( basis > 27.977 )
									ret := 0.370370
						if( Lower_Band > 27.4477 )
							if( basis <= 31.4635 )
								if( bearPower <= -0.104715 )
									ret := -0.076131
								if( bearPower > -0.104715 )
									ret := 0.008498
							if( basis > 31.4635 )
								if( bbp <= -0.193987 )
									ret := -0.934783 // sell
								if( bbp > -0.193987 )
									ret := -0.442308
					if( Lower_Band > 31.1882 )
						if( bullPower <= 0.026201 )
							if( basis <= 31.642 )
								if( Lower_Band <= 31.439 )
									ret := -0.089552
								if( Lower_Band > 31.439 )
									ret := 0.600000
							if( basis > 31.642 )
								if( Lower_Band <= 31.5442 )
									ret := -0.674419
								if( Lower_Band > 31.5442 )
									ret := -0.272727
						if( bullPower > 0.026201 )
							if( bearPower <= -0.241658 )
								if( Upper_Band <= 31.7661 )
									ret := 1.000000 // buy
								if( Upper_Band > 31.7661 )
									ret := -0.833333 // sell
							if( bearPower > -0.241658 )
								if( Lower_Band <= 31.4474 )
									ret := -0.560127
								if( Lower_Band > 31.4474 )
									ret := -0.770642 // sell
				if( Upper_Band > 31.9705 )
					if( Lower_Band <= 31.8997 )
						if( bullPower <= 0.203119 )
							if( bullPower <= 0.018039 )
								if( bbp <= -0.018855 )
									ret := 0.246053
								if( bbp > -0.018855 )
									ret := -0.480000
							if( bullPower > 0.018039 )
								if( bbp <= 0.298377 )
									ret := 0.062225
								if( bbp > 0.298377 )
									ret := -0.818182 // sell
						if( bullPower > 0.203119 )
							if( Upper_Band <= 32.3231 )
								if( bullPower <= 0.446698 )
									ret := 0.076613
								if( bullPower > 0.446698 )
									ret := -0.692308
							if( Upper_Band > 32.3231 )
								if( bullPower <= 0.28356 )
									ret := 0.453020
								if( bullPower > 0.28356 )
									ret := 0.158140
					if( Lower_Band > 31.8997 )
						if( Upper_Band <= 42.3691 )
							if( bullPower <= 0.112352 )
								if( bbp <= -0.262931 )
									ret := -0.194944
								if( bbp > -0.262931 )
									ret := 0.031552
							if( bullPower > 0.112352 )
								if( bbp <= -0.120077 )
									ret := -0.251559
								if( bbp > -0.120077 )
									ret := -0.070395
						if( Upper_Band > 42.3691 )
							if( bullPower <= -0.023756 )
								if( Upper_Band <= 43.5433 )
									ret := 0.358056
								if( Upper_Band > 43.5433 )
									ret := 0.048616
							if( bullPower > -0.023756 )
								if( bearPower <= -1.36162 )
									ret := -0.378641
								if( bearPower > -1.36162 )
									ret := 0.010213
		if( bbp > 0.454195 )
			if( bbm <= 0.108563 )
				if( Upper_Band <= 64.7199 )
					if( bbp <= 0.54549 )
						if( Upper_Band <= 47.908 )
							if( Upper_Band <= 44.2594 )
								if( Lower_Band <= 33.9038 )
									ret := -0.434783
								if( Lower_Band > 33.9038 )
									ret := -0.133333
							if( Upper_Band > 44.2594 )
								if( bbp <= 0.506481 )
									ret := -0.444444
								if( bbp > 0.506481 )
									ret := -0.697674
						if( Upper_Band > 47.908 )
							if( Upper_Band <= 59.4505 )
								if( basis <= 57.771 )
									ret := -0.125000
								if( basis > 57.771 )
									ret := 0.461538
							if( Upper_Band > 59.4505 )
								if( Upper_Band <= 62.4623 )
									ret := -0.437500
								if( Upper_Band > 62.4623 )
									ret := -0.666667
					if( bbp > 0.54549 )
						if( bbp <= 0.624569 )
							if( Lower_Band <= 22.0879 )
								ret := 0.842105 // buy
							if( Lower_Band > 22.0879 )
								if( bearPower <= 0.257815 )
									ret := -0.382716
								if( bearPower > 0.257815 )
									ret := 0.066351
						if( bbp > 0.624569 )
							if( basis <= 53.6192 )
								if( basis <= 46.8314 )
									ret := -0.289738
								if( basis > 46.8314 )
									ret := 0.253521
							if( basis > 53.6192 )
								if( Lower_Band <= 53.9862 )
									ret := -0.888889 // sell
								if( Lower_Band > 53.9862 )
									ret := -0.566265
				if( Upper_Band > 64.7199 )
					if( Upper_Band <= 72.8793 )
						if( basis <= 69.5875 )
							if( basis <= 64.4611 )
								ret := 0.500000
							if( basis > 64.4611 )
								if( basis <= 69.2922 )
									ret := 0.017857
								if( basis > 69.2922 )
									ret := -0.307692
						if( basis > 69.5875 )
							if( bearPower <= 0.230464 )
								ret := 0.066667
							if( bearPower > 0.230464 )
								if( basis <= 70.7754 )
									ret := 0.911765 // buy
								if( basis > 70.7754 )
									ret := 0.684211
					if( Upper_Band > 72.8793 )
						if( Upper_Band <= 75.23 )
							if( Upper_Band <= 74.883 )
								if( Upper_Band <= 74.1418 )
									ret := -0.500000
								if( Upper_Band > 74.1418 )
									ret := 0.055556
							if( Upper_Band > 74.883 )
								ret := -0.733333 // sell
						if( Upper_Band > 75.23 )
							if( basis <= 78.6842 )
								if( bbp <= 0.891727 )
									ret := 0.000000
								if( bbp > 0.891727 )
									ret := -0.181818
							if( basis > 78.6842 )
								ret := 0.125000
			if( bbm > 0.108563 )
				if( bearPower <= 2.05963 )
					if( basis <= 80.8363 )
						if( Upper_Band <= 20.7922 )
							if( bearPower <= 1.18915 )
								if( bbm <= 0.38995 )
									ret := -0.083333
								if( bbm > 0.38995 )
									ret := 0.636364
							if( bearPower > 1.18915 )
								ret := 0.913043 // buy
						if( Upper_Band > 20.7922 )
							if( basis <= 35.3438 )
								if( Lower_Band <= 31.6206 )
									ret := -0.061343
								if( Lower_Band > 31.6206 )
									ret := -0.230644
							if( basis > 35.3438 )
								if( Upper_Band <= 36.2593 )
									ret := 0.444444
								if( Upper_Band > 36.2593 )
									ret := -0.014808
					if( basis > 80.8363 )
						if( bbm <= 0.752818 )
							if( bullPower <= 0.769145 )
								if( bbp <= 0.925893 )
									ret := 0.607143
								if( bbp > 0.925893 )
									ret := 1.000000 // buy
							if( bullPower > 0.769145 )
								ret := 0.133333
						if( bbm > 0.752818 )
							ret := 1.000000 // buy
				if( bearPower > 2.05963 )
					ret := -0.941176 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_UBER_15Min_8ad1b097(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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



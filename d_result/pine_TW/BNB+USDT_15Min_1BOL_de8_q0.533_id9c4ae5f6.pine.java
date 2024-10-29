//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: BNBUSDT_15Min_1BOL_9c4ae5f6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_1BOL_9c4ae5f6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_9c4ae5f6(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 28.5616 )
		if( dif_source_BBlower <= -7.77272 )
			if( BBupper <= 308.301 )
				if( dif_source_BBlower <= -8.50637 )
					if( dif_source_BBupper <= -28.1211 )
						if( dif_source_BBlower <= -11.5392 )
							if( dif_source_BBlower <= -11.6516 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -11.6516 )
								ret := 0.750000 // buy
						if( dif_source_BBlower > -11.5392 )
							ret := 1.000000 // buy
					if( dif_source_BBupper > -28.1211 )
						ret := 0.750000 // buy
				if( dif_source_BBlower > -8.50637 )
					if( dif_source_BBlower <= -8.42056 )
						ret := 0.250000
					if( dif_source_BBlower > -8.42056 )
						if( vrsi <= 17.7436 )
							if( vrsi <= 14.1132 )
								ret := 1.000000 // buy
							if( vrsi > 14.1132 )
								ret := 0.800000 // buy
						if( vrsi > 17.7436 )
							ret := 0.500000
			if( BBupper > 308.301 )
				if( BBupper <= 347.992 )
					if( BBlower <= 299.553 )
						if( dif_source_BBlower <= -14.9702 )
							ret := 0.500000
						if( dif_source_BBlower > -14.9702 )
							if( BBlower <= 272.828 )
								ret := -1.000000 // sell
							if( BBlower > 272.828 )
								if( dif_source_BBupper <= -35.3433 )
									ret := -0.285714
								if( dif_source_BBupper > -35.3433 )
									ret := -0.882353 // sell
					if( BBlower > 299.553 )
						if( dif_source_BBupper <= -23.7914 )
							if( dif_source_BBupper <= -26.4763 )
								if( vrsi <= 18.0996 )
									ret := 1.000000 // buy
								if( vrsi > 18.0996 )
									ret := 0.750000 // buy
							if( dif_source_BBupper > -26.4763 )
								if( BBlower <= 310.586 )
									ret := 0.250000
								if( BBlower > 310.586 )
									ret := 0.750000 // buy
						if( dif_source_BBupper > -23.7914 )
							if( BBlower <= 305.929 )
								if( BBlower <= 305.171 )
									ret := -0.500000
								if( BBlower > 305.171 )
									ret := -1.000000 // sell
							if( BBlower > 305.929 )
								ret := 0.500000
				if( BBupper > 347.992 )
					if( vrsi <= 20.8479 )
						if( dif_source_BBlower <= -29.3137 )
							if( BBupper <= 560.422 )
								if( dif_source_BBupper <= -102.722 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > -102.722 )
									ret := -1.000000 // sell
							if( BBupper > 560.422 )
								if( BBlower <= 461.77 )
									ret := 0.500000
								if( BBlower > 461.77 )
									ret := 0.714286 // buy
						if( dif_source_BBlower > -29.3137 )
							if( dif_source_BBupper <= -28.7024 )
								if( dif_source_BBupper <= -115.764 )
									ret := 0.965517 // buy
								if( dif_source_BBupper > -115.764 )
									ret := 0.607843
							if( dif_source_BBupper > -28.7024 )
								if( BBlower <= 432.796 )
									ret := 0.363636
								if( BBlower > 432.796 )
									ret := -0.500000
					if( vrsi > 20.8479 )
						if( dif_source_BBupper <= -116.772 )
							if( dif_source_BBupper <= -117.654 )
								ret := -0.166667
							if( dif_source_BBupper > -117.654 )
								ret := -1.000000 // sell
						if( dif_source_BBupper > -116.772 )
							if( BBlower <= 567.227 )
								if( BBlower <= 334.042 )
									ret := -0.714286 // sell
								if( BBlower > 334.042 )
									ret := 0.744186 // buy
							if( BBlower > 567.227 )
								if( vrsi <= 24.3496 )
									ret := -0.666667
								if( vrsi > 24.3496 )
									ret := 0.150000
		if( dif_source_BBlower > -7.77272 )
			if( BBlower <= 560.308 )
				if( BBlower <= 204.261 )
					if( dif_source_BBlower <= -2.87855 )
						if( BBupper <= 226.004 )
							ret := -1.000000 // sell
						if( BBupper > 226.004 )
							ret := -0.250000
					if( dif_source_BBlower > -2.87855 )
						if( BBupper <= 271.963 )
							if( dif_source_BBupper <= -20.2068 )
								if( dif_source_BBlower <= 19.4379 )
									ret := 0.734694 // buy
								if( dif_source_BBlower > 19.4379 )
									ret := -0.750000 // sell
							if( dif_source_BBupper > -20.2068 )
								if( BBupper <= 233.9 )
									ret := 0.000000
								if( BBupper > 233.9 )
									ret := -0.787879 // sell
						if( BBupper > 271.963 )
							if( dif_source_BBupper <= -50.1775 )
								ret := -0.750000 // sell
							if( dif_source_BBupper > -50.1775 )
								ret := -1.000000 // sell
				if( BBlower > 204.261 )
					if( vrsi <= 0.000649 )
						if( dif_source_BBupper <= -12.3744 )
							if( dif_source_BBlower <= 27.2118 )
								if( BBupper <= 267.631 )
									ret := -0.634615
								if( BBupper > 267.631 )
									ret := -0.261484
							if( dif_source_BBlower > 27.2118 )
								if( dif_source_BBupper <= -16.2799 )
									ret := 0.666667
								if( dif_source_BBupper > -16.2799 )
									ret := 0.000000
						if( dif_source_BBupper > -12.3744 )
							if( BBupper <= 234.165 )
								if( BBlower <= 206.459 )
									ret := 0.687500
								if( BBlower > 206.459 )
									ret := 0.140351
							if( BBupper > 234.165 )
								if( dif_source_BBlower <= 25.8229 )
									ret := -0.048193
								if( dif_source_BBlower > 25.8229 )
									ret := 0.666667
					if( vrsi > 0.000649 )
						if( dif_source_BBupper <= -11.2339 )
							if( dif_source_BBlower <= -3.08414 )
								if( dif_source_BBupper <= -53.5358 )
									ret := -0.657534
								if( dif_source_BBupper > -53.5358 )
									ret := 0.088435
							if( dif_source_BBlower > -3.08414 )
								if( dif_source_BBupper <= -18.086 )
									ret := 0.133615
								if( dif_source_BBupper > -18.086 )
									ret := 0.256005
						if( dif_source_BBupper > -11.2339 )
							if( BBupper <= 346.55 )
								if( BBlower <= 304.466 )
									ret := 0.112498
								if( BBlower > 304.466 )
									ret := -0.065299
							if( BBupper > 346.55 )
								if( BBlower <= 312.313 )
									ret := 0.772727 // buy
								if( BBlower > 312.313 )
									ret := 0.220999
			if( BBlower > 560.308 )
				if( BBupper <= 627.84 )
					if( dif_source_BBlower <= -6.56032 )
						if( vrsi <= 15.0024 )
							if( vrsi <= 1.85547 )
								ret := 0.500000
							if( vrsi > 1.85547 )
								ret := 1.000000 // buy
						if( vrsi > 15.0024 )
							if( vrsi <= 21.3526 )
								if( BBlower <= 575.555 )
									ret := 0.500000
								if( BBlower > 575.555 )
									ret := -1.000000 // sell
							if( vrsi > 21.3526 )
								if( vrsi <= 25.6505 )
									ret := 0.428571
								if( vrsi > 25.6505 )
									ret := 1.000000 // buy
					if( dif_source_BBlower > -6.56032 )
						if( BBupper <= 627.225 )
							if( vrsi <= 27.6426 )
								if( dif_source_BBlower <= 23.2331 )
									ret := -0.121475
								if( dif_source_BBlower > 23.2331 )
									ret := 0.223602
							if( vrsi > 27.6426 )
								if( BBupper <= 596.567 )
									ret := -0.044444
								if( BBupper > 596.567 )
									ret := 0.434211
						if( BBupper > 627.225 )
							if( BBupper <= 627.786 )
								if( BBlower <= 573.144 )
									ret := -1.000000 // sell
								if( BBlower > 573.144 )
									ret := -0.200000
							if( BBupper > 627.786 )
								ret := 0.000000
				if( BBupper > 627.84 )
					if( dif_source_BBupper <= -18.0299 )
						if( dif_source_BBupper <= -80.451 )
							if( BBlower <= 604.052 )
								ret := 1.000000 // buy
							if( BBlower > 604.052 )
								if( dif_source_BBlower <= 3.34762 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 3.34762 )
									ret := 0.000000
						if( dif_source_BBupper > -80.451 )
							if( dif_source_BBlower <= -0.477104 )
								if( BBlower <= 671.184 )
									ret := -0.952381 // sell
								if( BBlower > 671.184 )
									ret := -0.250000
							if( dif_source_BBlower > -0.477104 )
								if( BBlower <= 670.57 )
									ret := 0.183007
								if( BBlower > 670.57 )
									ret := -0.295455
					if( dif_source_BBupper > -18.0299 )
						if( vrsi <= 27.1621 )
							if( BBlower <= 692.135 )
								if( dif_source_BBupper <= -10.8126 )
									ret := 0.904762 // buy
								if( dif_source_BBupper > -10.8126 )
									ret := 0.428571
							if( BBlower > 692.135 )
								ret := -0.400000
						if( vrsi > 27.1621 )
							if( dif_source_BBlower <= 20.4852 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 20.4852 )
								ret := -0.250000
	if( vrsi > 28.5616 )
		if( BBupper <= 580.106 )
			if( BBlower <= 544.031 )
				if( BBupper <= 433.519 )
					if( dif_source_BBupper <= -75.5889 )
						if( BBupper <= 361.327 )
							if( BBupper <= 354.57 )
								if( BBlower <= 250.672 )
									ret := 0.951220 // buy
								if( BBlower > 250.672 )
									ret := 0.333333
							if( BBupper > 354.57 )
								if( BBlower <= 271.097 )
									ret := 0.290323
								if( BBlower > 271.097 )
									ret := -0.888889 // sell
						if( BBupper > 361.327 )
							if( BBlower <= 266.905 )
								if( vrsi <= 70.6478 )
									ret := 1.000000 // buy
								if( vrsi > 70.6478 )
									ret := 0.250000
							if( BBlower > 266.905 )
								ret := 1.000000 // buy
					if( dif_source_BBupper > -75.5889 )
						if( BBlower <= 186.827 )
							if( dif_source_BBlower <= 20.7625 )
								if( dif_source_BBlower <= 20.0314 )
									ret := 0.979592 // buy
								if( dif_source_BBlower > 20.0314 )
									ret := 0.727273 // buy
							if( dif_source_BBlower > 20.7625 )
								if( vrsi <= 75.1059 )
									ret := 0.517241
								if( vrsi > 75.1059 )
									ret := -0.538462
						if( BBlower > 186.827 )
							if( dif_source_BBupper <= -3.27725 )
								if( BBupper <= 334.431 )
									ret := 0.059744
								if( BBupper > 334.431 )
									ret := -0.030836
							if( dif_source_BBupper > -3.27725 )
								if( BBupper <= 249.522 )
									ret := 0.029878
								if( BBupper > 249.522 )
									ret := -0.026799
				if( BBupper > 433.519 )
					if( BBupper <= 506.148 )
						if( dif_source_BBlower <= 77.259 )
							if( BBlower <= 386.889 )
								if( vrsi <= 89.2857 )
									ret := 0.971429 // buy
								if( vrsi > 89.2857 )
									ret := 0.259259
							if( BBlower > 386.889 )
								if( BBlower <= 467.237 )
									ret := 0.198157
								if( BBlower > 467.237 )
									ret := 0.560166
						if( dif_source_BBlower > 77.259 )
							if( BBlower <= 382.856 )
								if( dif_source_BBlower <= 86.9738 )
									ret := 0.900000 // buy
								if( dif_source_BBlower > 86.9738 )
									ret := -0.166667
							if( BBlower > 382.856 )
								if( BBlower <= 385.319 )
									ret := -0.700000 // sell
								if( BBlower > 385.319 )
									ret := -1.000000 // sell
					if( BBupper > 506.148 )
						if( dif_source_BBlower <= 66.577 )
							if( dif_source_BBlower <= 58.8629 )
								if( BBlower <= 425.055 )
									ret := 0.641509
								if( BBlower > 425.055 )
									ret := 0.107832
							if( dif_source_BBlower > 58.8629 )
								if( BBupper <= 536.873 )
									ret := 0.193548
								if( BBupper > 536.873 )
									ret := -0.344371
						if( dif_source_BBlower > 66.577 )
							if( dif_source_BBupper <= -56.2974 )
								if( BBupper <= 551.317 )
									ret := 0.521739
								if( BBupper > 551.317 )
									ret := -0.391304
							if( dif_source_BBupper > -56.2974 )
								if( BBlower <= 504.881 )
									ret := -0.763359 // sell
								if( BBlower > 504.881 )
									ret := 0.888889 // buy
			if( BBlower > 544.031 )
				if( BBupper <= 565.152 )
					if( BBupper <= 558.646 )
						if( BBlower <= 548.581 )
							ret := 1.000000 // buy
						if( BBlower > 548.581 )
							if( dif_source_BBupper <= -0.150424 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -0.150424 )
								ret := -0.333333
					if( BBupper > 558.646 )
						if( vrsi <= 47.5069 )
							if( BBupper <= 559.949 )
								ret := 0.000000
							if( BBupper > 559.949 )
								if( dif_source_BBupper <= -14.7854 )
									ret := -0.250000
								if( dif_source_BBupper > -14.7854 )
									ret := -0.903226 // sell
						if( vrsi > 47.5069 )
							if( dif_source_BBupper <= -0.103919 )
								if( dif_source_BBlower <= 2.61848 )
									ret := 0.647059
								if( dif_source_BBlower > 2.61848 )
									ret := -0.029412
							if( dif_source_BBupper > -0.103919 )
								if( dif_source_BBlower <= 11.6217 )
									ret := -0.500000
								if( dif_source_BBlower > 11.6217 )
									ret := -1.000000 // sell
				if( BBupper > 565.152 )
					if( dif_source_BBlower <= 9.41876 )
						if( BBupper <= 579.96 )
							if( BBupper <= 579.045 )
								if( vrsi <= 44.0464 )
									ret := 0.250000
								if( vrsi > 44.0464 )
									ret := 0.884615 // buy
							if( BBupper > 579.045 )
								if( BBupper <= 579.146 )
									ret := -0.200000
								if( BBupper > 579.146 )
									ret := 0.761905 // buy
						if( BBupper > 579.96 )
							if( dif_source_BBupper <= -9.35845 )
								ret := 0.333333
							if( dif_source_BBupper > -9.35845 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 9.41876 )
						if( BBlower <= 547.007 )
							if( BBupper <= 576.387 )
								if( dif_source_BBlower <= 36.9596 )
									ret := 0.737226 // buy
								if( dif_source_BBlower > 36.9596 )
									ret := 0.000000
							if( BBupper > 576.387 )
								if( vrsi <= 66.1052 )
									ret := 0.500000
								if( vrsi > 66.1052 )
									ret := -0.090909
						if( BBlower > 547.007 )
							if( dif_source_BBlower <= 24.9286 )
								if( dif_source_BBlower <= 10.9627 )
									ret := 0.000000
								if( dif_source_BBlower > 10.9627 )
									ret := 0.381898
							if( dif_source_BBlower > 24.9286 )
								if( vrsi <= 49.9735 )
									ret := 0.600000
								if( vrsi > 49.9735 )
									ret := -0.250000
		if( BBupper > 580.106 )
			if( BBlower <= 476.425 )
				if( dif_source_BBupper <= -91.7675 )
					if( dif_source_BBlower <= 17.6837 )
						ret := 1.000000 // buy
					if( dif_source_BBlower > 17.6837 )
						if( BBlower <= 465.065 )
							ret := 1.000000 // buy
						if( BBlower > 465.065 )
							ret := 0.750000 // buy
				if( dif_source_BBupper > -91.7675 )
					ret := 0.250000
			if( BBlower > 476.425 )
				if( vrsi <= 56.312 )
					if( BBlower <= 692.034 )
						if( BBlower <= 677.604 )
							if( vrsi <= 51.8262 )
								if( BBlower <= 539.511 )
									ret := -0.167147
								if( BBlower > 539.511 )
									ret := 0.030538
							if( vrsi > 51.8262 )
								if( dif_source_BBlower <= 19.9085 )
									ret := 0.160147
								if( dif_source_BBlower > 19.9085 )
									ret := -0.020649
						if( BBlower > 677.604 )
							if( dif_source_BBupper <= -8.66174 )
								if( dif_source_BBlower <= -0.533913 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.533913 )
									ret := 0.416667
							if( dif_source_BBupper > -8.66174 )
								ret := -0.400000
					if( BBlower > 692.034 )
						if( BBupper <= 713.468 )
							ret := -0.250000
						if( BBupper > 713.468 )
							if( BBlower <= 692.587 )
								ret := -1.000000 // sell
							if( BBlower > 692.587 )
								ret := -0.857143 // sell
				if( vrsi > 56.312 )
					if( BBlower <= 498.065 )
						if( BBlower <= 496.78 )
							if( BBupper <= 583.127 )
								ret := 1.000000 // buy
							if( BBupper > 583.127 )
								if( BBupper <= 586.366 )
									ret := -0.333333
								if( BBupper > 586.366 )
									ret := -1.000000 // sell
						if( BBlower > 496.78 )
							if( dif_source_BBupper <= -1.85198 )
								ret := 0.250000
							if( dif_source_BBupper > -1.85198 )
								if( vrsi <= 76.6204 )
									ret := 0.966667 // buy
								if( vrsi > 76.6204 )
									ret := 0.650000
					if( BBlower > 498.065 )
						if( BBupper <= 588.687 )
							if( dif_source_BBupper <= -43.8204 )
								if( dif_source_BBlower <= 14.5987 )
									ret := 0.479167
								if( dif_source_BBlower > 14.5987 )
									ret := -0.777778 // sell
							if( dif_source_BBupper > -43.8204 )
								if( BBlower <= 527.367 )
									ret := -0.741176 // sell
								if( BBlower > 527.367 )
									ret := -0.210339
						if( BBupper > 588.687 )
							if( dif_source_BBlower <= 106.836 )
								if( BBlower <= 519.988 )
									ret := -0.538462
								if( BBlower > 519.988 )
									ret := -0.033122
							if( dif_source_BBlower > 106.836 )
								if( dif_source_BBupper <= 3.65984 )
									ret := -0.962963 // sell
								if( dif_source_BBupper > 3.65984 )
									ret := -0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_BNBUSDT_15Min_9c4ae5f6(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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



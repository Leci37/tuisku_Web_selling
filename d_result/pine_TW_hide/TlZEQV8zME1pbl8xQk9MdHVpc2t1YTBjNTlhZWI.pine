//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: NVDA_30Min_1BOL_a0c59aeb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1BOL_a0c59aeb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_a0c59aeb(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( BBlower <= 100.037 )
		if( BBlower <= 24.5635 )
			if( BBlower <= 23.1238 )
				if( dif_source_BBlower <= 654.646 )
					if( BBupper <= 1725.69 )
						if( BBupper <= 632.557 )
							if( vrsi <= 57.8091 )
								if( BBupper <= 494.567 )
									ret := 0.000000
								if( BBupper > 494.567 )
									ret := 0.837838 // buy
							if( vrsi > 57.8091 )
								if( vrsi <= 72.9565 )
									ret := -0.200000
								if( vrsi > 72.9565 )
									ret := -0.222222
						if( BBupper > 632.557 )
							if( BBupper <= 691.269 )
								ret := -0.785714 // sell
							if( BBupper > 691.269 )
								if( vrsi <= 22.9948 )
									ret := 0.782609 // buy
								if( vrsi > 22.9948 )
									ret := -0.340136
					if( BBupper > 1725.69 )
						if( dif_source_BBupper <= -1679.58 )
							if( BBupper <= 1833.36 )
								ret := 0.066667
							if( BBupper > 1833.36 )
								if( BBupper <= 1844.21 )
									ret := 1.000000 // buy
								if( BBupper > 1844.21 )
									ret := 0.125000
						if( dif_source_BBupper > -1679.58 )
							if( BBlower <= -385.54 )
								ret := 0.600000
							if( BBlower > -385.54 )
								if( dif_source_BBupper <= -1667.14 )
									ret := 0.900000 // buy
								if( dif_source_BBupper > -1667.14 )
									ret := 1.000000 // buy
				if( dif_source_BBlower > 654.646 )
					if( BBlower <= -537.674 )
						if( BBlower <= -544.475 )
							if( vrsi <= 49.923 )
								ret := 1.000000 // buy
							if( vrsi > 49.923 )
								ret := 0.555556
						if( BBlower > -544.475 )
							ret := 0.400000
					if( BBlower > -537.674 )
						ret := 1.000000 // buy
			if( BBlower > 23.1238 )
				if( BBupper <= 33.5971 )
					if( BBlower <= 23.2225 )
						ret := 1.000000 // buy
					if( BBlower > 23.2225 )
						if( BBupper <= 33.3188 )
							if( BBlower <= 23.8231 )
								if( vrsi <= 35.2788 )
									ret := 0.695652
								if( vrsi > 35.2788 )
									ret := 0.312500
							if( BBlower > 23.8231 )
								if( BBlower <= 23.8543 )
									ret := 1.000000 // buy
								if( BBlower > 23.8543 )
									ret := 0.708333 // buy
						if( BBupper > 33.3188 )
							ret := 1.000000 // buy
				if( BBupper > 33.5971 )
					ret := -0.071429
		if( BBlower > 24.5635 )
			if( dif_source_BBupper <= 1.78427 )
				if( dif_source_BBlower <= 12.2742 )
					if( BBlower <= 30.8379 )
						if( BBupper <= 33.5482 )
							if( dif_source_BBupper <= -6.20744 )
								ret := 0.750000 // buy
							if( dif_source_BBupper > -6.20744 )
								ret := -0.244025
						if( BBupper > 33.5482 )
							if( dif_source_BBupper <= -2.26492 )
								if( dif_source_BBlower <= 2.64837 )
									ret := 0.000000
								if( dif_source_BBlower > 2.64837 )
									ret := 0.885714 // buy
							if( dif_source_BBupper > -2.26492 )
								if( dif_source_BBupper <= -1.75222 )
									ret := -0.500000
								if( dif_source_BBupper > -1.75222 )
									ret := 0.571429
					if( BBlower > 30.8379 )
						if( BBlower <= 31.369 )
							if( vrsi <= 53.4686 )
								if( BBlower <= 31.0082 )
									ret := 0.283019
								if( BBlower > 31.0082 )
									ret := 0.773723 // buy
							if( vrsi > 53.4686 )
								if( BBlower <= 31.1483 )
									ret := -0.164948
								if( BBlower > 31.1483 )
									ret := 0.534091
						if( BBlower > 31.369 )
							if( dif_source_BBupper <= -16.6666 )
								if( dif_source_BBlower <= 2.92474 )
									ret := 0.896552 // buy
								if( dif_source_BBlower > 2.92474 )
									ret := 0.444444
							if( dif_source_BBupper > -16.6666 )
								if( crossunder_rsi_bbupperInt <= 0.5 )
									ret := 0.053571
								if( crossunder_rsi_bbupperInt > 0.5 )
									ret := 0.300000
				if( dif_source_BBlower > 12.2742 )
					if( dif_source_BBlower <= 31.1142 )
						if( BBupper <= 116.321 )
							if( BBlower <= 94.9906 )
								if( BBlower <= 90.6911 )
									ret := 0.218650
								if( BBlower > 90.6911 )
									ret := -0.254545
							if( BBlower > 94.9906 )
								if( BBupper <= 110.025 )
									ret := -0.458333
								if( BBupper > 110.025 )
									ret := 0.833333 // buy
						if( BBupper > 116.321 )
							if( dif_source_BBlower <= 18.2989 )
								if( dif_source_BBlower <= 13.0855 )
									ret := 0.166667
								if( dif_source_BBlower > 13.0855 )
									ret := -0.666667
							if( dif_source_BBlower > 18.2989 )
								if( dif_source_BBupper <= 0.892684 )
									ret := 0.308901
								if( dif_source_BBupper > 0.892684 )
									ret := -0.378378
					if( dif_source_BBlower > 31.1142 )
						if( BBlower <= 82.8601 )
							if( dif_source_BBlower <= 130.036 )
								ret := -0.538462
							if( dif_source_BBlower > 130.036 )
								ret := 0.200000
						if( BBlower > 82.8601 )
							if( vrsi <= 81.2312 )
								if( dif_source_BBlower <= 35.0447 )
									ret := 0.333333
								if( dif_source_BBlower > 35.0447 )
									ret := 0.747475 // buy
							if( vrsi > 81.2312 )
								ret := 0.076923
			if( dif_source_BBupper > 1.78427 )
				if( vrsi <= 91.2324 )
					if( BBupper <= 117.015 )
						if( dif_source_BBlower <= 25.0634 )
							if( dif_source_BBupper <= 1.98083 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > 1.98083 )
								if( dif_source_BBupper <= 2.44356 )
									ret := 0.604167
								if( dif_source_BBupper > 2.44356 )
									ret := 0.830508 // buy
						if( dif_source_BBlower > 25.0634 )
							ret := -0.666667
					if( BBupper > 117.015 )
						if( dif_source_BBlower <= 27.583 )
							if( vrsi <= 68.7941 )
								ret := -0.250000
							if( vrsi > 68.7941 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > 27.583 )
							ret := 0.900000 // buy
				if( vrsi > 91.2324 )
					if( dif_source_BBupper <= 6.33348 )
						if( dif_source_BBlower <= 12.7765 )
							ret := -0.619048
						if( dif_source_BBlower > 12.7765 )
							if( vrsi <= 94.3869 )
								ret := 0.750000 // buy
							if( vrsi > 94.3869 )
								ret := -0.166667
					if( dif_source_BBupper > 6.33348 )
						if( BBupper <= 78.1537 )
							ret := 1.000000 // buy
						if( BBupper > 78.1537 )
							ret := 0.857143 // buy
	if( BBlower > 100.037 )
		if( dif_source_BBlower <= 22.9722 )
			if( BBupper <= 136.208 )
				if( BBlower <= 115.957 )
					if( dif_source_BBupper <= -4.51705 )
						if( dif_source_BBupper <= -26.8354 )
							if( vrsi <= 64.3911 )
								if( vrsi <= 58.2275 )
									ret := 0.780000 // buy
								if( vrsi > 58.2275 )
									ret := 1.000000 // buy
							if( vrsi > 64.3911 )
								ret := -0.250000
						if( dif_source_BBupper > -26.8354 )
							if( BBlower <= 114.945 )
								if( dif_source_BBupper <= -20.5296 )
									ret := -0.731707 // sell
								if( dif_source_BBupper > -20.5296 )
									ret := -0.198229
							if( BBlower > 114.945 )
								if( vrsi <= 56.322 )
									ret := -0.094737
								if( vrsi > 56.322 )
									ret := 0.400000
					if( dif_source_BBupper > -4.51705 )
						if( dif_source_BBlower <= 14.5212 )
							if( dif_source_BBlower <= 6.39396 )
								if( vrsi <= 33.3247 )
									ret := -0.337017
								if( vrsi > 33.3247 )
									ret := 0.023364
							if( dif_source_BBlower > 6.39396 )
								if( dif_source_BBupper <= 0.4597 )
									ret := 0.251418
								if( dif_source_BBupper > 0.4597 )
									ret := -0.154930
						if( dif_source_BBlower > 14.5212 )
							if( dif_source_BBlower <= 19.4661 )
								if( dif_source_BBlower <= 15.4167 )
									ret := -0.606557
								if( dif_source_BBlower > 15.4167 )
									ret := -0.174603
							if( dif_source_BBlower > 19.4661 )
								if( BBupper <= 134.223 )
									ret := -0.833333 // sell
								if( BBupper > 134.223 )
									ret := -0.960000 // sell
				if( BBlower > 115.957 )
					if( BBlower <= 116.856 )
						if( BBlower <= 116.381 )
							if( BBlower <= 116.081 )
								if( dif_source_BBlower <= 2.7954 )
									ret := -0.700000 // sell
								if( dif_source_BBlower > 2.7954 )
									ret := -0.357143
							if( BBlower > 116.081 )
								if( vrsi <= 19.5305 )
									ret := -0.720000 // sell
								if( vrsi > 19.5305 )
									ret := -0.898990 // sell
						if( BBlower > 116.381 )
							if( dif_source_BBupper <= -3.04389 )
								if( BBupper <= 134.411 )
									ret := -0.810811 // sell
								if( BBupper > 134.411 )
									ret := -0.240000
							if( dif_source_BBupper > -3.04389 )
								ret := 0.555556
					if( BBlower > 116.856 )
						if( BBlower <= 119.139 )
							if( vrsi <= 19.0871 )
								if( BBlower <= 118.803 )
									ret := -0.216216
								if( BBlower > 118.803 )
									ret := -0.812500 // sell
							if( vrsi > 19.0871 )
								if( BBlower <= 118.753 )
									ret := 0.025701
								if( BBlower > 118.753 )
									ret := -0.504630
						if( BBlower > 119.139 )
							if( BBlower <= 120.475 )
								if( BBupper <= 128.377 )
									ret := 0.640719
								if( BBupper > 128.377 )
									ret := -0.007143
							if( BBlower > 120.475 )
								if( dif_source_BBupper <= -12.2132 )
									ret := 0.789474 // buy
								if( dif_source_BBupper > -12.2132 )
									ret := -0.348718
			if( BBupper > 136.208 )
				if( BBlower <= 142.845 )
					if( BBlower <= 138.302 )
						if( dif_source_BBupper <= -21.4738 )
							if( BBupper <= 154.17 )
								if( dif_source_BBupper <= -22.252 )
									ret := 0.747664 // buy
								if( dif_source_BBupper > -22.252 )
									ret := 0.042857
							if( BBupper > 154.17 )
								if( dif_source_BBlower <= 6.44046 )
									ret := -0.180851
								if( dif_source_BBlower > 6.44046 )
									ret := 0.365854
						if( dif_source_BBupper > -21.4738 )
							if( BBlower <= 118.727 )
								if( vrsi <= 89.4835 )
									ret := 0.269300
								if( vrsi > 89.4835 )
									ret := -0.271605
							if( BBlower > 118.727 )
								if( dif_source_BBupper <= -7.64855 )
									ret := -0.132439
								if( dif_source_BBupper > -7.64855 )
									ret := 0.044231
					if( BBlower > 138.302 )
						if( dif_source_BBlower <= 4.00329 )
							if( dif_source_BBupper <= -8.25298 )
								if( BBlower <= 140.433 )
									ret := 0.255814
								if( BBlower > 140.433 )
									ret := -0.428571
							if( dif_source_BBupper > -8.25298 )
								if( dif_source_BBupper <= -7.50941 )
									ret := 0.878788 // buy
								if( dif_source_BBupper > -7.50941 )
									ret := 0.415094
						if( dif_source_BBlower > 4.00329 )
							if( BBupper <= 152.512 )
								if( vrsi <= 63.3628 )
									ret := 0.466165
								if( vrsi > 63.3628 )
									ret := 0.768293 // buy
							if( BBupper > 152.512 )
								if( dif_source_BBlower <= 7.7191 )
									ret := 0.408889
								if( dif_source_BBlower > 7.7191 )
									ret := 0.054080
				if( BBlower > 142.845 )
					if( BBlower <= 163.066 )
						if( BBupper <= 204.144 )
							if( dif_source_BBlower <= 13.7458 )
								if( dif_source_BBlower <= 13.1401 )
									ret := -0.051390
								if( dif_source_BBlower > 13.1401 )
									ret := 0.269962
							if( dif_source_BBlower > 13.7458 )
								if( BBupper <= 198.618 )
									ret := -0.178552
								if( BBupper > 198.618 )
									ret := 0.777778 // buy
						if( BBupper > 204.144 )
							if( vrsi <= 18.6615 )
								if( dif_source_BBupper <= -53.613 )
									ret := -0.941176 // sell
								if( dif_source_BBupper > -53.613 )
									ret := 0.176471
							if( vrsi > 18.6615 )
								if( BBlower <= 158.012 )
									ret := -0.981818 // sell
								if( BBlower > 158.012 )
									ret := -0.888889 // sell
					if( BBlower > 163.066 )
						if( vrsi <= 4.60815 )
							if( BBupper <= 242.728 )
								if( BBupper <= 232.222 )
									ret := 0.396963
								if( BBupper > 232.222 )
									ret := 0.924528 // buy
							if( BBupper > 242.728 )
								if( dif_source_BBupper <= -21.4313 )
									ret := 0.061311
								if( dif_source_BBupper > -21.4313 )
									ret := -0.114754
						if( vrsi > 4.60815 )
							if( vrsi <= 43.7391 )
								if( vrsi <= 30.7382 )
									ret := -0.030429
								if( vrsi > 30.7382 )
									ret := -0.096338
							if( vrsi > 43.7391 )
								if( BBupper <= 202.692 )
									ret := 0.049596
								if( BBupper > 202.692 )
									ret := -0.027568
		if( dif_source_BBlower > 22.9722 )
			if( dif_source_BBlower <= 86.795 )
				if( dif_source_BBlower <= 23.1412 )
					if( vrsi <= 32.2038 )
						if( vrsi <= 17.7849 )
							ret := -0.090909
						if( vrsi > 17.7849 )
							if( dif_source_BBupper <= -23.705 )
								ret := 0.888889 // buy
							if( dif_source_BBupper > -23.705 )
								if( BBupper <= 263.396 )
									ret := 0.900000 // buy
								if( BBupper > 263.396 )
									ret := 1.000000 // buy
					if( vrsi > 32.2038 )
						if( dif_source_BBupper <= -9.12712 )
							if( BBlower <= 505.469 )
								if( BBlower <= 185.212 )
									ret := -0.142857
								if( BBlower > 185.212 )
									ret := 0.457627
							if( BBlower > 505.469 )
								ret := -0.230769
						if( dif_source_BBupper > -9.12712 )
							if( vrsi <= 94.1663 )
								if( BBupper <= 183.074 )
									ret := 0.454545
								if( BBupper > 183.074 )
									ret := -0.258621
							if( vrsi > 94.1663 )
								ret := 0.733333 // buy
				if( dif_source_BBlower > 23.1412 )
					if( BBlower <= 360.761 )
						if( dif_source_BBlower <= 34.0558 )
							if( dif_source_BBupper <= -3.46186 )
								if( BBupper <= 338.494 )
									ret := 0.006531
								if( BBupper > 338.494 )
									ret := -0.668317
							if( dif_source_BBupper > -3.46186 )
								if( dif_source_BBupper <= -1.34531 )
									ret := 0.274194
								if( dif_source_BBupper > -1.34531 )
									ret := 0.088066
						if( dif_source_BBlower > 34.0558 )
							if( vrsi <= 21.1815 )
								if( dif_source_BBlower <= 47.3109 )
									ret := -0.496269
								if( dif_source_BBlower > 47.3109 )
									ret := 0.321429
							if( vrsi > 21.1815 )
								if( dif_source_BBupper <= 3.33557 )
									ret := -0.152406
								if( dif_source_BBupper > 3.33557 )
									ret := 0.061185
					if( BBlower > 360.761 )
						if( BBlower <= 841.824 )
							if( BBlower <= 511.988 )
								if( BBlower <= 502.793 )
									ret := 0.081281
								if( BBlower > 502.793 )
									ret := -0.229947
							if( BBlower > 511.988 )
								if( BBupper <= 941.862 )
									ret := 0.166758
								if( BBupper > 941.862 )
									ret := 0.539474
						if( BBlower > 841.824 )
							if( BBlower <= 910.694 )
								if( BBlower <= 854.478 )
									ret := -0.421053
								if( BBlower > 854.478 )
									ret := -0.025287
							if( BBlower > 910.694 )
								ret := 1.000000 // buy
			if( dif_source_BBlower > 86.795 )
				if( BBupper <= 974.422 )
					if( BBupper <= 935.568 )
						ret := -0.118329
					if( BBupper > 935.568 )
						if( vrsi <= 25.6163 )
							ret := -0.214286
						if( vrsi > 25.6163 )
							if( vrsi <= 87.971 )
								if( BBlower <= 855.94 )
									ret := -0.834862 // sell
								if( BBlower > 855.94 )
									ret := -0.985075 // sell
							if( vrsi > 87.971 )
								ret := -0.200000
				if( BBupper > 974.422 )
					if( BBupper <= 1197.9 )
						if( dif_source_BBupper <= -11.7033 )
							if( dif_source_BBupper <= -34.967 )
								if( BBlower <= 933.741 )
									ret := 0.090909
								if( BBlower > 933.741 )
									ret := 0.681818
							if( dif_source_BBupper > -34.967 )
								if( vrsi <= 50.4885 )
									ret := 0.538462
								if( vrsi > 50.4885 )
									ret := -0.489362
						if( dif_source_BBupper > -11.7033 )
							if( dif_source_BBlower <= 136.078 )
								if( dif_source_BBupper <= 27.0698 )
									ret := 0.936170 // buy
								if( dif_source_BBupper > 27.0698 )
									ret := 0.526316
							if( dif_source_BBlower > 136.078 )
								if( BBupper <= 1037.32 )
									ret := -0.346154
								if( BBupper > 1037.32 )
									ret := 0.836207 // buy
					if( BBupper > 1197.9 )
						if( BBupper <= 1253.56 )
							if( dif_source_BBlower <= 129.349 )
								ret := 0.750000 // buy
							if( dif_source_BBlower > 129.349 )
								if( dif_source_BBlower <= 145.191 )
									ret := -0.780822 // sell
								if( dif_source_BBlower > 145.191 )
									ret := -0.282353
						if( BBupper > 1253.56 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_a0c59aeb(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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



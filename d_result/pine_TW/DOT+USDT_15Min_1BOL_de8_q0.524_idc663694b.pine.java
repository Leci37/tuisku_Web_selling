//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: DOTUSDT_15Min_1BOL_c663694b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_1BOL_c663694b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_c663694b(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBlower <= -0.038589 )
		if( vrsi <= 33.2798 )
			if( BBlower <= 15.3819 )
				if( dif_source_BBupper <= -1.30103 )
					if( dif_source_BBlower <= -0.116247 )
						if( dif_source_BBupper <= -1.79243 )
							if( dif_source_BBlower <= -0.773347 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -0.773347 )
								if( BBupper <= 12.2431 )
									ret := 0.692308
								if( BBupper > 12.2431 )
									ret := 0.107843
						if( dif_source_BBupper > -1.79243 )
							if( BBupper <= 9.57421 )
								if( dif_source_BBlower <= -0.256116 )
									ret := 0.804878 // buy
								if( dif_source_BBlower > -0.256116 )
									ret := -0.083333
							if( BBupper > 9.57421 )
								if( BBlower <= 9.55289 )
									ret := 0.901408 // buy
								if( BBlower > 9.55289 )
									ret := 0.687500
					if( dif_source_BBlower > -0.116247 )
						if( dif_source_BBupper <= -1.69411 )
							if( dif_source_BBupper <= -2.86855 )
								if( dif_source_BBupper <= -3.53114 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -3.53114 )
									ret := -0.750000 // sell
							if( dif_source_BBupper > -2.86855 )
								if( BBupper <= 11.4482 )
									ret := 0.300000
								if( BBupper > 11.4482 )
									ret := -0.666667
						if( dif_source_BBupper > -1.69411 )
							if( BBlower <= 8.6664 )
								if( dif_source_BBupper <= -1.50956 )
									ret := 0.800000 // buy
								if( dif_source_BBupper > -1.50956 )
									ret := -0.083333
							if( BBlower > 8.6664 )
								if( BBlower <= 13.0599 )
									ret := 0.653846
								if( BBlower > 13.0599 )
									ret := 1.000000 // buy
				if( dif_source_BBupper > -1.30103 )
					if( vrsi <= 1.47381 )
						if( BBupper <= 8.28807 )
							if( dif_source_BBlower <= -0.097672 )
								if( BBupper <= 5.11289 )
									ret := 1.000000 // buy
								if( BBupper > 5.11289 )
									ret := 0.391892
							if( dif_source_BBlower > -0.097672 )
								if( dif_source_BBupper <= -0.839615 )
									ret := -0.925926 // sell
								if( dif_source_BBupper > -0.839615 )
									ret := 0.146067
						if( BBupper > 8.28807 )
							if( BBupper <= 9.31994 )
								ret := -1.000000 // sell
							if( BBupper > 9.31994 )
								if( BBupper <= 10.4999 )
									ret := 0.250000
								if( BBupper > 10.4999 )
									ret := -1.000000 // sell
					if( vrsi > 1.47381 )
						if( vrsi <= 4.58137 )
							if( dif_source_BBupper <= -0.9235 )
								if( dif_source_BBlower <= -0.167065 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.167065 )
									ret := -0.200000
							if( dif_source_BBupper > -0.9235 )
								if( BBupper <= 8.00239 )
									ret := 0.685714
								if( BBupper > 8.00239 )
									ret := 0.958333 // buy
						if( vrsi > 4.58137 )
							if( dif_source_BBupper <= -1.10019 )
								if( dif_source_BBlower <= -0.162437 )
									ret := 0.521739
								if( dif_source_BBlower > -0.162437 )
									ret := -0.588235
							if( dif_source_BBupper > -1.10019 )
								if( BBlower <= 5.07068 )
									ret := 0.037543
								if( BBlower > 5.07068 )
									ret := 0.342027
			if( BBlower > 15.3819 )
				if( vrsi <= 4.44677 )
					if( BBlower <= 16.5857 )
						ret := 0.833333 // buy
					if( BBlower > 16.5857 )
						ret := 0.000000
				if( vrsi > 4.44677 )
					if( dif_source_BBlower <= -0.275555 )
						ret := 0.000000
					if( dif_source_BBlower > -0.275555 )
						if( vrsi <= 18.5644 )
							if( vrsi <= 8.62744 )
								ret := -0.750000 // sell
							if( vrsi > 8.62744 )
								ret := -1.000000 // sell
						if( vrsi > 18.5644 )
							if( BBlower <= 16.4008 )
								ret := 0.250000
							if( BBlower > 16.4008 )
								ret := -0.750000 // sell
		if( vrsi > 33.2798 )
			if( BBlower <= 4.54509 )
				if( BBupper <= 4.76147 )
					if( vrsi <= 46.3832 )
						if( dif_source_BBlower <= -0.045855 )
							ret := 0.200000
						if( dif_source_BBlower > -0.045855 )
							ret := 0.750000 // buy
					if( vrsi > 46.3832 )
						if( BBlower <= 4.39918 )
							ret := 0.000000
						if( BBlower > 4.39918 )
							ret := 0.250000
				if( BBupper > 4.76147 )
					if( dif_source_BBlower <= -0.270097 )
						if( dif_source_BBlower <= -0.332533 )
							ret := -0.750000 // sell
						if( dif_source_BBlower > -0.332533 )
							ret := -1.000000 // sell
					if( dif_source_BBlower > -0.270097 )
						if( dif_source_BBupper <= -1.655 )
							ret := 0.200000
						if( dif_source_BBupper > -1.655 )
							if( dif_source_BBupper <= -0.983646 )
								ret := -1.000000 // sell
							if( dif_source_BBupper > -0.983646 )
								if( dif_source_BBupper <= -0.67948 )
									ret := 0.000000
								if( dif_source_BBupper > -0.67948 )
									ret := -0.607143
			if( BBlower > 4.54509 )
				if( dif_source_BBupper <= -2.51535 )
					if( BBupper <= 14.6473 )
						if( BBupper <= 12.5877 )
							ret := 0.500000
						if( BBupper > 12.5877 )
							if( dif_source_BBupper <= -3.59841 )
								if( BBupper <= 12.8215 )
									ret := -1.000000 // sell
								if( BBupper > 12.8215 )
									ret := 0.400000
							if( dif_source_BBupper > -3.59841 )
								if( vrsi <= 40.3758 )
									ret := -0.600000
								if( vrsi > 40.3758 )
									ret := -0.931818 // sell
					if( BBupper > 14.6473 )
						if( BBlower <= 14.9586 )
							ret := 1.000000 // buy
						if( BBlower > 14.9586 )
							ret := 0.500000
				if( dif_source_BBupper > -2.51535 )
					if( dif_source_BBupper <= -1.42857 )
						if( BBupper <= 11.4197 )
							if( dif_source_BBlower <= -0.152445 )
								if( dif_source_BBlower <= -0.199507 )
									ret := 0.736842 // buy
								if( dif_source_BBlower > -0.199507 )
									ret := 0.956522 // buy
							if( dif_source_BBlower > -0.152445 )
								if( dif_source_BBupper <= -1.75399 )
									ret := -0.200000
								if( dif_source_BBupper > -1.75399 )
									ret := 0.568182
						if( BBupper > 11.4197 )
							if( vrsi <= 53.5872 )
								if( vrsi <= 43.7739 )
									ret := -0.285714
								if( vrsi > 43.7739 )
									ret := -0.833333 // sell
							if( vrsi > 53.5872 )
								if( BBupper <= 17.3286 )
									ret := 0.750000 // buy
								if( BBupper > 17.3286 )
									ret := 1.000000 // buy
					if( dif_source_BBupper > -1.42857 )
						if( BBupper <= 14.641 )
							if( BBupper <= 7.71405 )
								if( dif_source_BBupper <= -0.434332 )
									ret := 0.237006
								if( dif_source_BBupper > -0.434332 )
									ret := -0.036082
							if( BBupper > 7.71405 )
								if( vrsi <= 36.8084 )
									ret := -0.551020
								if( vrsi > 36.8084 )
									ret := 0.003861
						if( BBupper > 14.641 )
							if( BBlower <= 13.8845 )
								if( BBupper <= 14.6955 )
									ret := 0.666667
								if( BBupper > 14.6955 )
									ret := 1.000000 // buy
							if( BBlower > 13.8845 )
								if( dif_source_BBlower <= -0.062519 )
									ret := -0.083333
								if( dif_source_BBlower > -0.062519 )
									ret := 0.750000 // buy
	if( dif_source_BBlower > -0.038589 )
		if( dif_source_BBlower <= 0.855473 )
			if( BBlower <= 15.3826 )
				if( vrsi <= 41.3806 )
					if( dif_source_BBlower <= 0.146238 )
						if( dif_source_BBupper <= -0.386884 )
							if( vrsi <= 37.6802 )
								if( BBlower <= 6.75264 )
									ret := 0.145898
								if( BBlower > 6.75264 )
									ret := -0.026969
							if( vrsi > 37.6802 )
								if( BBlower <= 7.12153 )
									ret := 0.262626
								if( BBlower > 7.12153 )
									ret := 0.565789
						if( dif_source_BBupper > -0.386884 )
							if( BBupper <= 4.28757 )
								if( dif_source_BBlower <= 0.07486 )
									ret := 0.092217
								if( dif_source_BBlower > 0.07486 )
									ret := 0.279597
							if( BBupper > 4.28757 )
								if( BBupper <= 6.41746 )
									ret := -0.024327
								if( BBupper > 6.41746 )
									ret := 0.054307
					if( dif_source_BBlower > 0.146238 )
						if( vrsi <= 19.3642 )
							if( BBlower <= 14.2472 )
								if( dif_source_BBupper <= -0.192304 )
									ret := 0.232051
								if( dif_source_BBupper > -0.192304 )
									ret := 0.104091
							if( BBlower > 14.2472 )
								if( dif_source_BBlower <= 0.370728 )
									ret := -0.120000
								if( dif_source_BBlower > 0.370728 )
									ret := -0.761905 // sell
						if( vrsi > 19.3642 )
							if( dif_source_BBupper <= -2.29154 )
								if( BBlower <= 12.2618 )
									ret := 0.000000
								if( BBlower > 12.2618 )
									ret := 0.745455 // buy
							if( dif_source_BBupper > -2.29154 )
								if( BBlower <= 10.4724 )
									ret := 0.085313
								if( BBlower > 10.4724 )
									ret := -0.281407
				if( vrsi > 41.3806 )
					if( BBlower <= 3.92191 )
						if( dif_source_BBlower <= 0.117278 )
							if( vrsi <= 95.3233 )
								if( dif_source_BBupper <= -1.72523 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -1.72523 )
									ret := -0.011719
							if( vrsi > 95.3233 )
								if( BBlower <= 3.68615 )
									ret := 0.076923
								if( BBlower > 3.68615 )
									ret := -0.695652
						if( dif_source_BBlower > 0.117278 )
							if( BBlower <= 3.58938 )
								if( dif_source_BBupper <= -0.041256 )
									ret := 0.035714
								if( dif_source_BBupper > -0.041256 )
									ret := -0.222222
							if( BBlower > 3.58938 )
								if( vrsi <= 43.8292 )
									ret := -0.368421
								if( vrsi > 43.8292 )
									ret := 0.312839
					if( BBlower > 3.92191 )
						if( dif_source_BBupper <= 0.229715 )
							if( dif_source_BBlower <= 0.263162 )
								if( dif_source_BBlower <= 0.106728 )
									ret := 0.018062
								if( dif_source_BBlower > 0.106728 )
									ret := 0.066832
							if( dif_source_BBlower > 0.263162 )
								if( BBlower <= 4.97505 )
									ret := -0.090099
								if( BBlower > 4.97505 )
									ret := 0.019580
						if( dif_source_BBupper > 0.229715 )
							if( BBlower <= 5.66966 )
								ret := -0.500000
							if( BBlower > 5.66966 )
								if( dif_source_BBlower <= 0.741316 )
									ret := 0.533333
								if( dif_source_BBlower > 0.741316 )
									ret := 1.000000 // buy
			if( BBlower > 15.3826 )
				if( vrsi <= 20.7139 )
					if( BBupper <= 17.3813 )
						if( BBlower <= 15.8201 )
							ret := -1.000000 // sell
						if( BBlower > 15.8201 )
							ret := -0.750000 // sell
					if( BBupper > 17.3813 )
						ret := 0.000000
				if( vrsi > 20.7139 )
					if( BBupper <= 17.4376 )
						if( vrsi <= 35.2861 )
							if( BBlower <= 16.2039 )
								if( vrsi <= 29.7059 )
									ret := -0.692308
								if( vrsi > 29.7059 )
									ret := -0.142857
							if( BBlower > 16.2039 )
								if( dif_source_BBlower <= 0.193795 )
									ret := 0.000000
								if( dif_source_BBlower > 0.193795 )
									ret := 1.000000 // buy
						if( vrsi > 35.2861 )
							if( dif_source_BBlower <= 0.254319 )
								if( vrsi <= 47.9488 )
									ret := -0.703704 // sell
								if( vrsi > 47.9488 )
									ret := -0.200000
							if( dif_source_BBlower > 0.254319 )
								if( dif_source_BBupper <= -0.300626 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -0.300626 )
									ret := -0.555556
					if( BBupper > 17.4376 )
						if( dif_source_BBupper <= -1.22121 )
							ret := 0.666667
						if( dif_source_BBupper > -1.22121 )
							ret := 0.000000
		if( dif_source_BBlower > 0.855473 )
			if( vrsi <= 14.9302 )
				if( dif_source_BBupper <= -1.46517 )
					if( BBlower <= 8.44996 )
						if( dif_source_BBlower <= 1.76078 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 1.76078 )
							if( BBupper <= 11.9932 )
								if( vrsi <= 12.1112 )
									ret := 0.833333 // buy
								if( vrsi > 12.1112 )
									ret := 1.000000 // buy
							if( BBupper > 11.9932 )
								ret := 0.000000
					if( BBlower > 8.44996 )
						if( vrsi <= 10.6086 )
							ret := -1.000000 // sell
						if( vrsi > 10.6086 )
							if( BBupper <= 12.6582 )
								ret := 0.500000
							if( BBupper > 12.6582 )
								ret := 1.000000 // buy
				if( dif_source_BBupper > -1.46517 )
					if( BBlower <= 14.2686 )
						if( vrsi <= 8.70812 )
							if( BBlower <= 5.65776 )
								ret := -0.333333
							if( BBlower > 5.65776 )
								if( BBupper <= 7.503 )
									ret := 0.000000
								if( BBupper > 7.503 )
									ret := 0.693333
						if( vrsi > 8.70812 )
							if( BBupper <= 9.37835 )
								if( BBupper <= 7.34297 )
									ret := 0.857143 // buy
								if( BBupper > 7.34297 )
									ret := -0.300000
							if( BBupper > 9.37835 )
								if( dif_source_BBupper <= -0.097172 )
									ret := 0.625000
								if( dif_source_BBupper > -0.097172 )
									ret := -0.800000 // sell
					if( BBlower > 14.2686 )
						ret := -1.000000 // sell
			if( vrsi > 14.9302 )
				if( BBlower <= 9.10332 )
					if( BBupper <= 10.5382 )
						if( vrsi <= 37.8277 )
							if( dif_source_BBlower <= 1.47566 )
								if( BBlower <= 6.11826 )
									ret := 0.612500
								if( BBlower > 6.11826 )
									ret := 0.152610
							if( dif_source_BBlower > 1.47566 )
								if( BBlower <= 5.60762 )
									ret := 0.500000
								if( BBlower > 5.60762 )
									ret := -0.443299
						if( vrsi > 37.8277 )
							if( BBlower <= 8.86989 )
								if( dif_source_BBupper <= -0.138111 )
									ret := -0.185430
								if( dif_source_BBupper > -0.138111 )
									ret := -0.055724
							if( BBlower > 8.86989 )
								if( vrsi <= 62.9167 )
									ret := 0.372549
								if( vrsi > 62.9167 )
									ret := -0.134831
					if( BBupper > 10.5382 )
						if( BBupper <= 11.865 )
							if( dif_source_BBupper <= -0.683208 )
								if( dif_source_BBlower <= 3.59613 )
									ret := 0.738220 // buy
								if( dif_source_BBlower > 3.59613 )
									ret := -0.461538
							if( dif_source_BBupper > -0.683208 )
								if( BBupper <= 10.9594 )
									ret := 0.601626
								if( BBupper > 10.9594 )
									ret := -0.448000
						if( BBupper > 11.865 )
							if( dif_source_BBupper <= -3.59805 )
								if( BBlower <= 7.26287 )
									ret := 0.785714 // buy
								if( BBlower > 7.26287 )
									ret := -0.555556
							if( dif_source_BBupper > -3.59805 )
								if( BBupper <= 12.0313 )
									ret := -0.247423
								if( BBupper > 12.0313 )
									ret := -0.800000 // sell
				if( BBlower > 9.10332 )
					if( dif_source_BBupper <= -2.61257 )
						if( BBlower <= 10.5442 )
							if( dif_source_BBlower <= 1.19727 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 1.19727 )
								ret := 0.857143 // buy
						if( BBlower > 10.5442 )
							ret := 0.000000
					if( dif_source_BBupper > -2.61257 )
						if( vrsi <= 99.2085 )
							if( dif_source_BBupper <= 0.379467 )
								if( vrsi <= 78.2085 )
									ret := -0.288618
								if( vrsi > 78.2085 )
									ret := -0.580420
							if( dif_source_BBupper > 0.379467 )
								if( BBlower <= 14.5041 )
									ret := 0.000000
								if( BBlower > 14.5041 )
									ret := 0.714286 // buy
						if( vrsi > 99.2085 )
							if( dif_source_BBlower <= 1.19759 )
								ret := 0.833333 // buy
							if( dif_source_BBlower > 1.19759 )
								ret := 0.500000
	
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
float op_operation = decision_tree_0_DOTUSDT_15Min_c663694b(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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



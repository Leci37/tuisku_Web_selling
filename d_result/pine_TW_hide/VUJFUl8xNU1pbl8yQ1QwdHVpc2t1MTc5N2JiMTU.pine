//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: UBER_15Min_2CT0_1797bb15 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_2CT0_1797bb15", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_1797bb15(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= 0.635181 )
		if( ad <= -67861.3 )
			if( ad_mf <= -2.30977e+06 )
				if( ema2 <= 53.7304 )
					if( ad <= -2.58065e+06 )
						if( mf <= -0.614179 )
							if( ad <= -2.70407e+06 )
								if( ema1 <= 40.6728 )
									ret := -0.142857
								if( ema1 > 40.6728 )
									ret := 1.000000 // buy
							if( ad > -2.70407e+06 )
								ret := -1.000000 // sell
						if( mf > -0.614179 )
							if( mf <= -0.38487 )
								if( ad <= -5.82116e+06 )
									ret := 0.153846
								if( ad > -5.82116e+06 )
									ret := 0.796875 // buy
							if( mf > -0.38487 )
								if( ema13 <= 0.601592 )
									ret := 0.185022
								if( ema13 > 0.601592 )
									ret := 0.869565 // buy
					if( ad > -2.58065e+06 )
						if( ema3 <= 41.1326 )
							if( ema1 <= 29.8632 )
								ret := 1.000000 // buy
							if( ema1 > 29.8632 )
								if( ema1 <= 35.7273 )
									ret := 0.571429
								if( ema1 > 35.7273 )
									ret := 0.896552 // buy
						if( ema3 > 41.1326 )
							ret := -0.153846
				if( ema2 > 53.7304 )
					if( ema2 <= 60.7309 )
						ret := -0.666667
					if( ema2 > 60.7309 )
						ret := -0.111111
			if( ad_mf > -2.30977e+06 )
				if( ad <= -95085.2 )
					if( ema13 <= 0.388814 )
						if( ema3 <= 27.6786 )
							if( ad_mf <= -122788 )
								if( ema3 <= 27.3555 )
									ret := 0.009637
								if( ema3 > 27.3555 )
									ret := 0.308411
							if( ad_mf > -122788 )
								if( ad <= -105259 )
									ret := 0.657534
								if( ad > -105259 )
									ret := -0.076923
						if( ema3 > 27.6786 )
							if( ema12 <= -0.542445 )
								if( tema <= 38.0004 )
									ret := 0.830986 // buy
								if( tema > 38.0004 )
									ret := 0.283898
							if( ema12 > -0.542445 )
								if( mf <= -0.38379 )
									ret := -0.112593
								if( mf > -0.38379 )
									ret := -0.010586
					if( ema13 > 0.388814 )
						if( mf <= -0.053893 )
							if( tema <= 32.486 )
								if( tema <= 30.661 )
									ret := 0.391304
								if( tema > 30.661 )
									ret := -0.600000
							if( tema > 32.486 )
								if( mf <= -0.202984 )
									ret := 0.425000
								if( mf > -0.202984 )
									ret := 0.730769 // buy
						if( mf > -0.053893 )
							if( ema2 <= 26.7127 )
								if( ema2 <= 25.8135 )
									ret := 0.430233
								if( ema2 > 25.8135 )
									ret := 1.000000 // buy
							if( ema2 > 26.7127 )
								if( ad <= -1.10335e+06 )
									ret := 0.454167
								if( ad > -1.10335e+06 )
									ret := 0.052310
				if( ad > -95085.2 )
					if( ad <= -94034.3 )
						if( mf <= 0.110164 )
							if( ad <= -94635.9 )
								ret := -1.000000 // sell
							if( ad > -94635.9 )
								if( ad <= -94355 )
									ret := -0.312500
								if( ad > -94355 )
									ret := -0.961538 // sell
						if( mf > 0.110164 )
							ret := 0.000000
					if( ad > -94034.3 )
						if( mf <= 0.287398 )
							if( tema <= 26.2383 )
								if( ad_mf <= -77594.8 )
									ret := 0.718750 // buy
								if( ad_mf > -77594.8 )
									ret := -0.312500
							if( tema > 26.2383 )
								if( ema2 <= 50.3825 )
									ret := -0.238896
								if( ema2 > 50.3825 )
									ret := -0.027778
						if( mf > 0.287398 )
							if( mf <= 0.422622 )
								if( ema2 <= 32.8994 )
									ret := 0.100000
								if( ema2 > 32.8994 )
									ret := 0.744681 // buy
							if( mf > 0.422622 )
								ret := -0.181818
		if( ad > -67861.3 )
			if( mf <= -0.259818 )
				if( ema12 <= -0.192835 )
					if( ema1 <= 43.5098 )
						if( ad_mf <= -26071.6 )
							if( tema <= 32.1613 )
								if( ad <= -40649.3 )
									ret := 0.000000
								if( ad > -40649.3 )
									ret := 0.588235
							if( tema > 32.1613 )
								if( ema13 <= -0.601849 )
									ret := 1.000000 // buy
								if( ema13 > -0.601849 )
									ret := 0.750000 // buy
						if( ad_mf > -26071.6 )
							if( tema <= 38.2153 )
								if( ema13 <= -0.395473 )
									ret := 0.075269
								if( ema13 > -0.395473 )
									ret := 0.596491
							if( tema > 38.2153 )
								if( ema13 <= -0.378978 )
									ret := -0.487805
								if( ema13 > -0.378978 )
									ret := 0.000000
					if( ema1 > 43.5098 )
						if( mf <= -0.630857 )
							if( ema2 <= 58.883 )
								ret := 1.000000 // buy
							if( ema2 > 58.883 )
								ret := 0.818182 // buy
						if( mf > -0.630857 )
							if( ema13 <= -0.781883 )
								if( ad_mf <= -6232.89 )
									ret := -0.416667
								if( ad_mf > -6232.89 )
									ret := 0.588235
							if( ema13 > -0.781883 )
								if( ema3 <= 45.2575 )
									ret := 0.342105
								if( ema3 > 45.2575 )
									ret := 0.641026
				if( ema12 > -0.192835 )
					if( ad <= -53804 )
						if( ema2 <= 28.2229 )
							ret := -0.681818
						if( ema2 > 28.2229 )
							if( ema3 <= 46.5302 )
								if( ad <= -66259.4 )
									ret := -0.818182 // sell
								if( ad > -66259.4 )
									ret := 0.204082
							if( ema3 > 46.5302 )
								if( ema2 <= 54.0903 )
									ret := -0.818182 // sell
								if( ema2 > 54.0903 )
									ret := -0.555556
					if( ad > -53804 )
						if( ema12 <= 0.319883 )
							if( ad <= -21102.5 )
								if( ad <= -24996.7 )
									ret := 0.203077
								if( ad > -24996.7 )
									ret := 0.619565
							if( ad > -21102.5 )
								if( ad <= -18707.4 )
									ret := -0.562500
								if( ad > -18707.4 )
									ret := 0.114876
						if( ema12 > 0.319883 )
							if( ema1 <= 29.5514 )
								ret := -0.500000
							if( ema1 > 29.5514 )
								if( mf <= -0.429693 )
									ret := -0.666667
								if( mf > -0.429693 )
									ret := -1.000000 // sell
			if( mf > -0.259818 )
				if( ema13 <= -0.050489 )
					if( ema1 <= 27.5955 )
						if( ema12 <= -0.121401 )
							if( ema1 <= 27.0732 )
								if( ema12 <= -0.249898 )
									ret := 0.074074
								if( ema12 > -0.249898 )
									ret := 0.569620
							if( ema1 > 27.0732 )
								if( ad <= -262 )
									ret := 0.923077 // buy
								if( ad > -262 )
									ret := 1.000000 // buy
						if( ema12 > -0.121401 )
							if( ema1 <= 19.5337 )
								if( ad_mf <= -7616.97 )
									ret := -0.153846
								if( ad_mf > -7616.97 )
									ret := -0.909091 // sell
							if( ema1 > 19.5337 )
								if( ad_mf <= 0.077877 )
									ret := 0.205087
								if( ad_mf > 0.077877 )
									ret := -0.250000
					if( ema1 > 27.5955 )
						if( ema1 <= 27.7346 )
							if( ema2 <= 27.6948 )
								ret := 0.086957
							if( ema2 > 27.6948 )
								if( ema13 <= -0.157568 )
									ret := -0.125000
								if( ema13 > -0.157568 )
									ret := -0.916667 // sell
						if( ema1 > 27.7346 )
							if( tema <= 74.9491 )
								if( ema2 <= 74.4508 )
									ret := 0.127891
								if( ema2 > 74.4508 )
									ret := 0.511628
							if( tema > 74.9491 )
								if( ad <= -652.125 )
									ret := -0.219298
								if( ad > -652.125 )
									ret := 0.080808
				if( ema13 > -0.050489 )
					if( ad <= -232.756 )
						if( ema13 <= 1.12841 )
							if( ad_mf <= -63687.5 )
								if( ema1 <= 42.3 )
									ret := 0.808824 // buy
								if( ema1 > 42.3 )
									ret := 0.303030
							if( ad_mf > -63687.5 )
								if( ad_mf <= -913.149 )
									ret := 0.042066
								if( ad_mf > -913.149 )
									ret := 0.162934
						if( ema13 > 1.12841 )
							if( ema2 <= 38.7212 )
								if( ad_mf <= -32302.1 )
									ret := -0.785714 // sell
								if( ad_mf > -32302.1 )
									ret := -1.000000 // sell
							if( ema2 > 38.7212 )
								ret := -0.150000
					if( ad > -232.756 )
						if( ema2 <= 21.5052 )
							if( ema2 <= 21.4899 )
								if( ema1 <= 20.7704 )
									ret := -0.933333 // sell
								if( ema1 > 20.7704 )
									ret := -0.400000
							if( ema2 > 21.4899 )
								ret := -1.000000 // sell
						if( ema2 > 21.5052 )
							if( ema12 <= 0.003034 )
								if( ema12 <= -0.038522 )
									ret := -0.397849
								if( ema12 > -0.038522 )
									ret := 0.124665
							if( ema12 > 0.003034 )
								if( tema <= 22.3347 )
									ret := 0.712500 // buy
								if( tema > 22.3347 )
									ret := -0.103902
	if( ad_mf > 0.635181 )
		if( ema2 <= 51.9834 )
			if( ema3 <= 22.4303 )
				if( ema3 <= 21.781 )
					if( ema13 <= 1.23489 )
						if( ema3 <= 20.7146 )
							if( ema3 <= 16.8215 )
								ret := 0.333333
							if( ema3 > 16.8215 )
								if( ema2 <= 19.9116 )
									ret := -0.620000
								if( ema2 > 19.9116 )
									ret := -0.200000
						if( ema3 > 20.7146 )
							if( tema <= 21.6174 )
								if( ema12 <= -0.25495 )
									ret := 0.857143 // buy
								if( ema12 > -0.25495 )
									ret := 0.168724
							if( tema > 21.6174 )
								if( ema12 <= 0.093667 )
									ret := -0.075472
								if( ema12 > 0.093667 )
									ret := -0.420000
					if( ema13 > 1.23489 )
						if( ad_mf <= 477641 )
							ret := -0.111111
						if( ad_mf > 477641 )
							ret := 0.730769 // buy
				if( ema3 > 21.781 )
					if( ad_mf <= 634.279 )
						if( ad_mf <= 560.574 )
							ret := 0.500000
						if( ad_mf > 560.574 )
							ret := 1.000000 // buy
					if( ad_mf > 634.279 )
						if( ema12 <= 0.140382 )
							if( ema3 <= 22.3655 )
								if( ema3 <= 21.8277 )
									ret := 0.785714 // buy
								if( ema3 > 21.8277 )
									ret := 0.141176
							if( ema3 > 22.3655 )
								ret := -0.444444
						if( ema12 > 0.140382 )
							if( ema13 <= 0.318113 )
								ret := 0.105263
							if( ema13 > 0.318113 )
								if( ema12 <= 0.206695 )
									ret := 1.000000 // buy
								if( ema12 > 0.206695 )
									ret := 0.333333
			if( ema3 > 22.4303 )
				if( ad <= 87471.5 )
					if( ema12 <= -0.040957 )
						if( ema13 <= -0.132746 )
							if( ema1 <= 30.0975 )
								if( ad_mf <= 8523.39 )
									ret := -0.284069
								if( ad_mf > 8523.39 )
									ret := -0.028369
							if( ema1 > 30.0975 )
								if( ema2 <= 32.3209 )
									ret := 0.183511
								if( ema2 > 32.3209 )
									ret := -0.091082
						if( ema13 > -0.132746 )
							if( ad_mf <= 18094.1 )
								if( ad_mf <= 10568.8 )
									ret := 0.106957
								if( ad_mf > 10568.8 )
									ret := 0.536842
							if( ad_mf > 18094.1 )
								if( ema12 <= -0.085767 )
									ret := -0.625000
								if( ema12 > -0.085767 )
									ret := -0.052133
					if( ema12 > -0.040957 )
						if( ema13 <= -0.200013 )
							ret := 1.000000 // buy
						if( ema13 > -0.200013 )
							if( ema12 <= 0.669361 )
								if( ema13 <= 0.735787 )
									ret := -0.122851
								if( ema13 > 0.735787 )
									ret := 0.279070
							if( ema12 > 0.669361 )
								if( ad <= 15515.6 )
									ret := -1.000000 // sell
								if( ad > 15515.6 )
									ret := -0.518519
				if( ad > 87471.5 )
					if( ad_mf <= 3.27813e+06 )
						if( ema12 <= 0.191066 )
							if( ema12 <= 0.156439 )
								if( ema3 <= 51.7601 )
									ret := -0.007342
								if( ema3 > 51.7601 )
									ret := -0.428571
							if( ema12 > 0.156439 )
								if( ad_mf <= 1.39395e+06 )
									ret := 0.137232
								if( ad_mf > 1.39395e+06 )
									ret := -0.270270
						if( ema12 > 0.191066 )
							if( ad <= 1.79264e+06 )
								if( ema3 <= 28.3472 )
									ret := -0.309859
								if( ema3 > 28.3472 )
									ret := -0.038302
							if( ad > 1.79264e+06 )
								if( ad_mf <= 1.97924e+06 )
									ret := -0.896552 // sell
								if( ad_mf > 1.97924e+06 )
									ret := -0.363014
					if( ad_mf > 3.27813e+06 )
						if( ema2 <= 36.2635 )
							if( ad <= 4.94343e+06 )
								if( ema3 <= 30.349 )
									ret := -0.178571
								if( ema3 > 30.349 )
									ret := 0.433962
							if( ad > 4.94343e+06 )
								if( ema13 <= 0.372086 )
									ret := -0.361111
								if( ema13 > 0.372086 )
									ret := -0.952381 // sell
						if( ema2 > 36.2635 )
							if( mf <= 0.237728 )
								if( ema1 <= 37.7344 )
									ret := -0.666667
								if( ema1 > 37.7344 )
									ret := 0.031250
							if( mf > 0.237728 )
								if( ema12 <= 0.068395 )
									ret := -0.698113
								if( ema12 > 0.068395 )
									ret := -0.947368 // sell
		if( ema2 > 51.9834 )
			if( ema13 <= -0.374301 )
				if( tema <= 62.27 )
					if( ema12 <= -0.594363 )
						if( ema1 <= 60.8163 )
							if( ema12 <= -0.62361 )
								if( ema13 <= -1.30344 )
									ret := 0.166667
								if( ema13 > -1.30344 )
									ret := -0.222222
							if( ema12 > -0.62361 )
								ret := -0.750000 // sell
						if( ema1 > 60.8163 )
							ret := -0.833333 // sell
					if( ema12 > -0.594363 )
						if( ema3 <= 60.765 )
							if( ad <= 3881.67 )
								if( ema13 <= -0.552547 )
									ret := 0.923077 // buy
								if( ema13 > -0.552547 )
									ret := 0.454545
							if( ad > 3881.67 )
								if( ema2 <= 58.7531 )
									ret := 0.083916
								if( ema2 > 58.7531 )
									ret := -0.425926
						if( ema3 > 60.765 )
							if( tema <= 60.5401 )
								ret := 0.727273 // buy
							if( tema > 60.5401 )
								if( ema12 <= -0.239729 )
									ret := -0.050000
								if( ema12 > -0.239729 )
									ret := 0.500000
				if( tema > 62.27 )
					if( ema1 <= 72.0726 )
						if( mf <= -0.096665 )
							if( ad <= 395070 )
								if( ema1 <= 70.8021 )
									ret := 0.280992
								if( ema1 > 70.8021 )
									ret := 0.666667
							if( ad > 395070 )
								if( mf <= -0.26745 )
									ret := 0.454545
								if( mf > -0.26745 )
									ret := -0.320000
						if( mf > -0.096665 )
							if( ema3 <= 71.7837 )
								if( ema2 <= 65.5291 )
									ret := 0.095238
								if( ema2 > 65.5291 )
									ret := 0.762712 // buy
							if( ema3 > 71.7837 )
								ret := -0.375000
					if( ema1 > 72.0726 )
						if( mf <= -0.260564 )
							if( ad_mf <= 173839 )
								if( ema12 <= -0.307733 )
									ret := 0.000000
								if( ema12 > -0.307733 )
									ret := 0.444444
							if( ad_mf > 173839 )
								ret := 0.727273 // buy
						if( mf > -0.260564 )
							if( ad <= 156534 )
								if( ad <= 84970.8 )
									ret := -0.040000
								if( ad > 84970.8 )
									ret := 0.454545
							if( ad > 156534 )
								if( tema <= 76.5054 )
									ret := -0.344828
								if( tema > 76.5054 )
									ret := 0.040000
			if( ema13 > -0.374301 )
				if( ema1 <= 53.0267 )
					if( ad_mf <= 345348 )
						if( ad_mf <= 1054.59 )
							if( ema13 <= -0.078694 )
								ret := 0.684211
							if( ema13 > -0.078694 )
								ret := 0.133333
						if( ad_mf > 1054.59 )
							if( ema1 <= 52.5236 )
								if( ema3 <= 52.4206 )
									ret := -0.149425
								if( ema3 > 52.4206 )
									ret := -0.692308
							if( ema1 > 52.5236 )
								if( ema12 <= 0.128768 )
									ret := 0.141304
								if( ema12 > 0.128768 )
									ret := 0.606061
					if( ad_mf > 345348 )
						if( ema3 <= 52.6362 )
							if( ema1 <= 52.6034 )
								if( ema3 <= 52.2285 )
									ret := 0.707317 // buy
								if( ema3 > 52.2285 )
									ret := 1.000000 // buy
							if( ema1 > 52.6034 )
								if( ad <= 539341 )
									ret := 0.600000
								if( ad > 539341 )
									ret := 0.000000
						if( ema3 > 52.6362 )
							if( ema12 <= -0.009781 )
								ret := 0.500000
							if( ema12 > -0.009781 )
								ret := -0.333333
				if( ema1 > 53.0267 )
					if( ema12 <= 0.039321 )
						if( ema2 <= 53.3418 )
							if( ad_mf <= 2316.8 )
								ret := 0.062500
							if( ad_mf > 2316.8 )
								if( ema13 <= 0.000524 )
									ret := -0.411765
								if( ema13 > 0.000524 )
									ret := -0.900000 // sell
						if( ema2 > 53.3418 )
							if( ema2 <= 53.4578 )
								if( mf <= -0.331684 )
									ret := 0.687500
								if( mf > -0.331684 )
									ret := 0.291667
							if( ema2 > 53.4578 )
								if( ema13 <= -0.022868 )
									ret := -0.013305
								if( ema13 > -0.022868 )
									ret := -0.119574
					if( ema12 > 0.039321 )
						if( ad <= 22021.2 )
							if( ad <= 12850 )
								if( ema12 <= 0.056033 )
									ret := 0.216667
								if( ema12 > 0.056033 )
									ret := -0.069079
							if( ad > 12850 )
								if( ema2 <= 72.4016 )
									ret := -0.620155
								if( ema2 > 72.4016 )
									ret := -0.125000
						if( ad > 22021.2 )
							if( ema12 <= 0.442268 )
								if( ad_mf <= 188237 )
									ret := 0.237354
								if( ad_mf > 188237 )
									ret := 0.036917
							if( ema12 > 0.442268 )
								if( mf <= 0.057219 )
									ret := 0.500000
								if( mf > 0.057219 )
									ret := -0.145594
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_UBER_15Min_1797bb15(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)

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



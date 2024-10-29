//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: DOGEUSDT_5Min_2TV0_31c1d21c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_5Min_2TV0_31c1d21c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_5Min_31c1d21c(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.00055 )
		if( tema <= 0.080895 )
			if( VIM <= 1.29371 )
				if( VIP <= 0.730517 )
					if( tema <= 0.080501 )
						if( ema13 <= -0.001077 )
							ret := 1.000000 // buy
						if( ema13 > -0.001077 )
							if( ema13 <= -0.001057 )
								ret := 0.250000
							if( ema13 > -0.001057 )
								if( ema12 <= -0.000575 )
									ret := 1.000000 // buy
								if( ema12 > -0.000575 )
									ret := 0.833333 // buy
					if( tema > 0.080501 )
						ret := 0.571429
				if( VIP > 0.730517 )
					if( ema1 <= 0.076871 )
						if( ema2 <= 0.076231 )
							if( ema12 <= -0.000731 )
								if( VIM <= 1.20971 )
									ret := -0.500000
								if( VIM > 1.20971 )
									ret := 0.200000
							if( ema12 > -0.000731 )
								if( tema <= 0.07069 )
									ret := 1.000000 // buy
								if( tema > 0.07069 )
									ret := 0.461538
						if( ema2 > 0.076231 )
							ret := -1.000000 // sell
					if( ema1 > 0.076871 )
						if( ema12 <= -0.000745 )
							if( ema1 <= 0.081534 )
								ret := 0.142857
							if( ema1 > 0.081534 )
								ret := 1.000000 // buy
						if( ema12 > -0.000745 )
							if( ema13 <= -0.001304 )
								ret := 0.500000
							if( ema13 > -0.001304 )
								ret := 1.000000 // buy
			if( VIM > 1.29371 )
				if( VIP_VIM <= -0.670845 )
					if( ema13 <= -0.001015 )
						ret := 1.000000 // buy
					if( ema13 > -0.001015 )
						if( VIM <= 1.3409 )
							ret := 1.000000 // buy
						if( VIM > 1.3409 )
							ret := -0.200000
				if( VIP_VIM > -0.670845 )
					if( VIP <= 0.667102 )
						ret := -1.000000 // sell
					if( VIP > 0.667102 )
						if( ema2 <= 0.078459 )
							ret := 0.500000
						if( ema2 > 0.078459 )
							ret := 1.000000 // buy
		if( tema > 0.080895 )
			if( ema12 <= -0.000806 )
				if( ema3 <= 0.187941 )
					if( ema1 <= 0.171157 )
						if( tema <= 0.161135 )
							if( tema <= 0.155195 )
								if( VIM <= 1.17154 )
									ret := 0.590062
								if( VIM > 1.17154 )
									ret := 0.165995
							if( tema > 0.155195 )
								if( VIP <= 0.820672 )
									ret := 0.623563
								if( VIP > 0.820672 )
									ret := -0.037500
						if( tema > 0.161135 )
							if( VIP_VIM <= -0.625572 )
								if( VIP_VIM <= -0.649111 )
									ret := 0.314815
								if( VIP_VIM > -0.649111 )
									ret := 0.954545 // buy
							if( VIP_VIM > -0.625572 )
								if( VIM <= 1.1587 )
									ret := 0.390244
								if( VIM > 1.1587 )
									ret := -0.236559
					if( ema1 > 0.171157 )
						if( VIP_VIM <= -0.121685 )
							if( tema <= 0.183206 )
								if( ema13 <= -0.003266 )
									ret := 0.094595
								if( ema13 > -0.003266 )
									ret := 0.653285
							if( tema > 0.183206 )
								if( ema1 <= 0.185526 )
									ret := -0.230769
								if( ema1 > 0.185526 )
									ret := 0.517241
						if( VIP_VIM > -0.121685 )
							if( ema12 <= -0.000942 )
								ret := -1.000000 // sell
							if( ema12 > -0.000942 )
								ret := -0.250000
				if( ema3 > 0.187941 )
					if( VIP <= 0.762594 )
						if( VIM <= 1.32683 )
							if( VIP_VIM <= -0.503254 )
								if( VIM <= 1.26808 )
									ret := 0.247312
								if( VIM > 1.26808 )
									ret := -0.382353
							if( VIP_VIM > -0.503254 )
								if( ema12 <= -0.001084 )
									ret := -0.880952 // sell
								if( ema12 > -0.001084 )
									ret := -0.181818
						if( VIM > 1.32683 )
							if( ema13 <= -0.004324 )
								ret := 0.333333
							if( ema13 > -0.004324 )
								if( ema12 <= -0.001034 )
									ret := 0.931034 // buy
								if( ema12 > -0.001034 )
									ret := 0.333333
					if( VIP > 0.762594 )
						if( VIM <= 1.12264 )
							if( VIM <= 1.09635 )
								ret := 0.333333
							if( VIM > 1.09635 )
								if( VIM <= 1.11627 )
									ret := -1.000000 // sell
								if( VIM > 1.11627 )
									ret := -0.166667
						if( VIM > 1.12264 )
							if( ema1 <= 0.207985 )
								if( ema3 <= 0.202382 )
									ret := 0.453608
								if( ema3 > 0.202382 )
									ret := -0.153846
							if( ema1 > 0.207985 )
								if( ema12 <= -0.000879 )
									ret := 0.900000 // buy
								if( ema12 > -0.000879 )
									ret := 0.250000
			if( ema12 > -0.000806 )
				if( tema <= 0.149393 )
					if( VIM <= 1.22504 )
						if( ema2 <= 0.137968 )
							if( VIP_VIM <= -0.518232 )
								if( ema12 <= -0.000747 )
									ret := 0.000000
								if( ema12 > -0.000747 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.518232 )
								if( VIP_VIM <= -0.299278 )
									ret := 0.134286
								if( VIP_VIM > -0.299278 )
									ret := 0.523490
						if( ema2 > 0.137968 )
							if( ema2 <= 0.143798 )
								if( VIP <= 0.760988 )
									ret := 0.333333
								if( VIP > 0.760988 )
									ret := 0.792793 // buy
							if( ema2 > 0.143798 )
								if( ema1 <= 0.144622 )
									ret := -0.181818
								if( ema1 > 0.144622 )
									ret := 0.541872
					if( VIM > 1.22504 )
						if( ema13 <= -0.001183 )
							if( VIM <= 1.3592 )
								if( VIP_VIM <= -0.415961 )
									ret := -0.005698
								if( VIP_VIM > -0.415961 )
									ret := 0.875000 // buy
							if( VIM > 1.3592 )
								if( VIM <= 1.36919 )
									ret := -0.933333 // sell
								if( VIM > 1.36919 )
									ret := -0.275862
						if( ema13 > -0.001183 )
							if( ema12 <= -0.000734 )
								if( VIP <= 0.677764 )
									ret := 0.833333 // buy
								if( VIP > 0.677764 )
									ret := 0.285714
							if( ema12 > -0.000734 )
								if( tema <= 0.12286 )
									ret := 0.217822
								if( tema > 0.12286 )
									ret := -0.004132
				if( tema > 0.149393 )
					if( VIP <= 0.718864 )
						if( ema2 <= 0.167517 )
							if( ema12 <= -0.00071 )
								if( ema13 <= -0.001503 )
									ret := -0.200000
								if( ema13 > -0.001503 )
									ret := 0.746667 // buy
							if( ema12 > -0.00071 )
								if( VIP <= 0.679402 )
									ret := 0.127660
								if( VIP > 0.679402 )
									ret := 0.555556
						if( ema2 > 0.167517 )
							if( ema3 <= 0.175896 )
								if( tema <= 0.167462 )
									ret := -0.176471
								if( tema > 0.167462 )
									ret := -0.764706 // sell
							if( ema3 > 0.175896 )
								if( VIP <= 0.668228 )
									ret := -0.500000
								if( VIP > 0.668228 )
									ret := 0.659091
					if( VIP > 0.718864 )
						if( VIM <= 1.14172 )
							if( VIP_VIM <= -0.3553 )
								if( VIP <= 0.76659 )
									ret := -1.000000 // sell
								if( VIP > 0.76659 )
									ret := -0.250000
							if( VIP_VIM > -0.3553 )
								if( VIP_VIM <= -0.259287 )
									ret := 0.404255
								if( VIP_VIM > -0.259287 )
									ret := 0.101266
						if( VIM > 1.14172 )
							if( VIM <= 1.17412 )
								if( ema3 <= 0.162326 )
									ret := -0.543046
								if( ema3 > 0.162326 )
									ret := -0.053435
							if( VIM > 1.17412 )
								if( ema13 <= -0.001233 )
									ret := 0.171429
								if( ema13 > -0.001233 )
									ret := -0.009324
	if( ema12 > -0.00055 )
		if( ema13 <= 0.000669 )
			if( VIP <= 0.693284 )
				if( ema12 <= -0.000496 )
					if( VIP_VIM <= -0.697185 )
						if( VIM <= 1.34009 )
							if( VIP_VIM <= -0.712769 )
								if( VIM <= 1.3329 )
									ret := 0.636364
								if( VIM > 1.3329 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.712769 )
								ret := 0.285714
						if( VIM > 1.34009 )
							if( VIM <= 1.40615 )
								if( VIP_VIM <= -0.792942 )
									ret := 0.727273 // buy
								if( VIP_VIM > -0.792942 )
									ret := -0.315789
							if( VIM > 1.40615 )
								if( VIP <= 0.49728 )
									ret := -0.333333
								if( VIP > 0.49728 )
									ret := -0.800000 // sell
					if( VIP_VIM > -0.697185 )
						if( VIP <= 0.691125 )
							if( VIM <= 1.21837 )
								if( ema12 <= -0.000529 )
									ret := 0.636364
								if( ema12 > -0.000529 )
									ret := 1.000000 // buy
							if( VIM > 1.21837 )
								if( ema2 <= 0.148401 )
									ret := 0.629921
								if( ema2 > 0.148401 )
									ret := -0.200000
						if( VIP > 0.691125 )
							if( VIM <= 1.24482 )
								ret := 0.250000
							if( VIM > 1.24482 )
								ret := -0.500000
				if( ema12 > -0.000496 )
					if( ema12 <= -0.000276 )
						if( VIM <= 1.39422 )
							if( VIP <= 0.448077 )
								if( ema12 <= -0.00042 )
									ret := 0.500000
								if( ema12 > -0.00042 )
									ret := 1.000000 // buy
							if( VIP > 0.448077 )
								if( VIM <= 1.35658 )
									ret := 0.196209
								if( VIM > 1.35658 )
									ret := 0.425000
						if( VIM > 1.39422 )
							if( tema <= 0.078743 )
								if( tema <= 0.073517 )
									ret := -0.500000
								if( tema > 0.073517 )
									ret := -1.000000 // sell
							if( tema > 0.078743 )
								if( VIM <= 1.42871 )
									ret := -0.085106
								if( VIM > 1.42871 )
									ret := -0.588235
					if( ema12 > -0.000276 )
						if( VIM <= 1.17008 )
							if( ema13 <= -0.00041 )
								if( ema2 <= 0.080259 )
									ret := -1.000000 // sell
								if( ema2 > 0.080259 )
									ret := -0.500000
							if( ema13 > -0.00041 )
								if( ema3 <= 0.063105 )
									ret := 0.723404 // buy
								if( ema3 > 0.063105 )
									ret := 0.450704
						if( VIM > 1.17008 )
							if( VIP <= 0.663842 )
								if( VIP_VIM <= -0.539705 )
									ret := -0.066581
								if( VIP_VIM > -0.539705 )
									ret := -0.900000 // sell
							if( VIP > 0.663842 )
								if( VIP_VIM <= -0.589327 )
									ret := 0.006390
								if( VIP_VIM > -0.589327 )
									ret := 0.316514
			if( VIP > 0.693284 )
				if( ema3 <= 0.06435 )
					if( ema13 <= -0.000446 )
						if( ema1 <= 0.059619 )
							ret := 0.000000
						if( ema1 > 0.059619 )
							if( ema3 <= 0.062856 )
								if( tema <= 0.061395 )
									ret := 0.827586 // buy
								if( tema > 0.061395 )
									ret := 0.333333
							if( ema3 > 0.062856 )
								ret := 1.000000 // buy
					if( ema13 > -0.000446 )
						if( ema12 <= 0.000139 )
							if( ema1 <= 0.064025 )
								if( VIP <= 0.95741 )
									ret := -0.026280
								if( VIP > 0.95741 )
									ret := 0.020609
							if( ema1 > 0.064025 )
								if( ema1 <= 0.064101 )
									ret := -0.288462
								if( ema1 > 0.064101 )
									ret := -0.077626
						if( ema12 > 0.000139 )
							if( tema <= 0.064391 )
								if( VIM <= 0.684482 )
									ret := -0.155172
								if( VIM > 0.684482 )
									ret := -0.429630
							if( tema > 0.064391 )
								if( VIM <= 0.650595 )
									ret := -0.600000
								if( VIM > 0.650595 )
									ret := 0.275862
				if( ema3 > 0.06435 )
					if( tema <= 0.107081 )
						if( ema13 <= -0.000332 )
							if( ema1 <= 0.078359 )
								if( VIM <= 1.17212 )
									ret := 0.171053
								if( VIM > 1.17212 )
									ret := 0.348691
							if( ema1 > 0.078359 )
								if( VIM <= 1.22825 )
									ret := 0.166299
								if( VIM > 1.22825 )
									ret := -0.016509
						if( ema13 > -0.000332 )
							if( VIM <= 0.552241 )
								if( ema13 <= 0.000375 )
									ret := 0.323529
								if( ema13 > 0.000375 )
									ret := -0.560748
							if( VIM > 0.552241 )
								if( VIP <= 0.811174 )
									ret := -0.017666
								if( VIP > 0.811174 )
									ret := 0.054193
					if( tema > 0.107081 )
						if( VIP_VIM <= -0.28085 )
							if( ema2 <= 0.177079 )
								if( ema3 <= 0.121379 )
									ret := -0.161059
								if( ema3 > 0.121379 )
									ret := -0.027870
							if( ema2 > 0.177079 )
								if( VIP_VIM <= -0.410346 )
									ret := 0.695122
								if( VIP_VIM > -0.410346 )
									ret := 0.144509
						if( VIP_VIM > -0.28085 )
							if( ema3 <= 0.219795 )
								if( VIP_VIM <= 0.356164 )
									ret := 0.047558
								if( VIP_VIM > 0.356164 )
									ret := -0.038715
							if( ema3 > 0.219795 )
								if( ema12 <= -0.000365 )
									ret := 0.000000
								if( ema12 > -0.000365 )
									ret := -0.966667 // sell
		if( ema13 > 0.000669 )
			if( ema1 <= 0.151907 )
				if( VIP_VIM <= 0.05908 )
					if( ema1 <= 0.097655 )
						if( VIM <= 0.977657 )
							ret := -1.000000 // sell
						if( VIM > 0.977657 )
							ret := 0.000000
					if( ema1 > 0.097655 )
						if( ema13 <= 0.000702 )
							if( VIP_VIM <= 0.013847 )
								if( ema2 <= 0.138916 )
									ret := 1.000000 // buy
								if( ema2 > 0.138916 )
									ret := 0.500000
							if( VIP_VIM > 0.013847 )
								ret := -0.571429
						if( ema13 > 0.000702 )
							if( VIP_VIM <= 0.014475 )
								if( VIM <= 1.00137 )
									ret := -0.200000
								if( VIM > 1.00137 )
									ret := 0.800000 // buy
							if( VIP_VIM > 0.014475 )
								if( tema <= 0.134138 )
									ret := 0.941176 // buy
								if( tema > 0.134138 )
									ret := 1.000000 // buy
				if( VIP_VIM > 0.05908 )
					if( tema <= 0.144231 )
						if( ema3 <= 0.076493 )
							if( VIP_VIM <= 0.386051 )
								if( VIM <= 0.825576 )
									ret := 0.605263
								if( VIM > 0.825576 )
									ret := -0.062500
							if( VIP_VIM > 0.386051 )
								if( tema <= 0.068638 )
									ret := 0.135135
								if( tema > 0.068638 )
									ret := -0.533708
						if( ema3 > 0.076493 )
							if( VIM <= 0.794625 )
								if( ema13 <= 0.005607 )
									ret := 0.061771
								if( ema13 > 0.005607 )
									ret := -0.894737 // sell
							if( VIM > 0.794625 )
								if( tema <= 0.080382 )
									ret := 0.511628
								if( tema > 0.080382 )
									ret := -0.102219
					if( tema > 0.144231 )
						if( VIM <= 0.892171 )
							if( tema <= 0.14962 )
								if( VIM <= 0.828841 )
									ret := 0.287823
								if( VIM > 0.828841 )
									ret := -0.049587
							if( tema > 0.14962 )
								if( ema13 <= 0.000833 )
									ret := -0.355372
								if( ema13 > 0.000833 )
									ret := 0.035941
						if( VIM > 0.892171 )
							if( ema12 <= 0.000556 )
								if( ema13 <= 0.000713 )
									ret := 0.166667
								if( ema13 > 0.000713 )
									ret := 0.842697 // buy
							if( ema12 > 0.000556 )
								if( ema2 <= 0.144112 )
									ret := 0.875000 // buy
								if( ema2 > 0.144112 )
									ret := -0.181818
			if( ema1 > 0.151907 )
				if( ema1 <= 0.155431 )
					if( VIP_VIM <= 0.472033 )
						if( VIM <= 0.937791 )
							if( VIP <= 1.24348 )
								if( VIM <= 0.829896 )
									ret := -0.296875
								if( VIM > 0.829896 )
									ret := -0.611336
							if( VIP > 1.24348 )
								if( VIP_VIM <= 0.436683 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.436683 )
									ret := 0.250000
						if( VIM > 0.937791 )
							if( VIM <= 1.04289 )
								if( ema1 <= 0.153396 )
									ret := 0.733333 // buy
								if( ema1 > 0.153396 )
									ret := -0.125000
							if( VIM > 1.04289 )
								if( ema12 <= 0.000146 )
									ret := 0.250000
								if( ema12 > 0.000146 )
									ret := -1.000000 // sell
					if( VIP_VIM > 0.472033 )
						if( ema1 <= 0.153287 )
							if( VIP <= 1.31237 )
								if( ema12 <= 0.001334 )
									ret := -0.218182
								if( ema12 > 0.001334 )
									ret := 0.562500
							if( VIP > 1.31237 )
								if( ema13 <= 0.002491 )
									ret := -0.344828
								if( ema13 > 0.002491 )
									ret := -0.916667 // sell
						if( ema1 > 0.153287 )
							if( ema3 <= 0.151096 )
								ret := 1.000000 // buy
							if( ema3 > 0.151096 )
								if( tema <= 0.154853 )
									ret := 0.608696
								if( tema > 0.154853 )
									ret := 0.061856
				if( ema1 > 0.155431 )
					if( VIP_VIM <= 0.466153 )
						if( VIP_VIM <= 0.415965 )
							if( ema1 <= 0.214057 )
								if( VIP_VIM <= 0.414189 )
									ret := -0.016340
								if( VIP_VIM > 0.414189 )
									ret := -0.833333 // sell
							if( ema1 > 0.214057 )
								if( ema2 <= 0.217011 )
									ret := -0.666667
								if( ema2 > 0.217011 )
									ret := -0.181818
						if( VIP_VIM > 0.415965 )
							if( tema <= 0.189475 )
								if( ema13 <= 0.001715 )
									ret := 0.224080
								if( ema13 > 0.001715 )
									ret := -0.244186
							if( tema > 0.189475 )
								if( ema13 <= 0.001009 )
									ret := -0.344828
								if( ema13 > 0.001009 )
									ret := 0.530120
					if( VIP_VIM > 0.466153 )
						if( VIP_VIM <= 0.530575 )
							if( ema1 <= 0.194938 )
								if( VIP_VIM <= 0.50443 )
									ret := -0.310345
								if( VIP_VIM > 0.50443 )
									ret := -0.755556 // sell
							if( ema1 > 0.194938 )
								if( ema12 <= 0.001585 )
									ret := -0.160000
								if( ema12 > 0.001585 )
									ret := 1.000000 // buy
						if( VIP_VIM > 0.530575 )
							if( ema3 <= 0.159288 )
								if( VIP_VIM <= 0.597266 )
									ret := 0.623529
								if( VIP_VIM > 0.597266 )
									ret := 0.109290
							if( ema3 > 0.159288 )
								if( ema3 <= 0.187457 )
									ret := -0.218935
								if( ema3 > 0.187457 )
									ret := 0.139394
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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



//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_DOGEUSDT_5Min_31c1d21c(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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



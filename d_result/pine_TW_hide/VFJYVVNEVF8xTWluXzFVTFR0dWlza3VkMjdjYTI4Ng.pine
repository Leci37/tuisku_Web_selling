//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: TRXUSDT_1Min_1ULT_d27ca286 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_1ULT_d27ca286", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_d27ca286(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma_downInt <= 0.5 )
		if( cr_upInt <= 0.5 )
			if( cr_downInt <= 0.5 )
				if( avg2 <= 0.151014 )
					if( cr_down2Int <= 0.5 )
						if( cr_up2Int <= 0.5 )
							if( avg <= 0.150795 )
								if( avg <= 0.110979 )
									ret := 0.316279
								if( avg > 0.110979 )
									ret := -0.077864
							if( avg > 0.150795 )
								if( avg2 <= 0.150795 )
									ret := 0.490040
								if( avg2 > 0.150795 )
									ret := 0.044379
						if( cr_up2Int > 0.5 )
							if( avg2 <= 0.148189 )
								if( avg <= 0.147843 )
									ret := -0.222269
								if( avg > 0.147843 )
									ret := 0.722222 // buy
							if( avg2 > 0.148189 )
								if( avg2 <= 0.149148 )
									ret := -0.894118 // sell
								if( avg2 > 0.149148 )
									ret := -0.391304
					if( cr_down2Int > 0.5 )
						if( avg <= 0.124787 )
							if( avg2 <= 0.12243 )
								if( avg <= 0.120334 )
									ret := 0.032479
								if( avg > 0.120334 )
									ret := 0.517647
							if( avg2 > 0.12243 )
								if( avg2 <= 0.123482 )
									ret := -0.495575
								if( avg2 > 0.123482 )
									ret := 0.180328
						if( avg > 0.124787 )
							if( avg <= 0.148754 )
								if( avg2 <= 0.138281 )
									ret := 0.366372
								if( avg2 > 0.138281 )
									ret := -0.030120
							if( avg > 0.148754 )
								if( avg <= 0.150484 )
									ret := 0.628866
								if( avg > 0.150484 )
									ret := 0.893617 // buy
				if( avg2 > 0.151014 )
					if( cr_down2Int <= 0.5 )
						if( avg2 <= 0.156804 )
							if( avg <= 0.157232 )
								if( cr_up2Int <= 0.5 )
									ret := -0.164889
								if( cr_up2Int > 0.5 )
									ret := -0.469453
							if( avg > 0.157232 )
								ret := -1.000000 // sell
						if( avg2 > 0.156804 )
							if( avg2 <= 0.159346 )
								if( avg <= 0.15954 )
									ret := -0.012672
								if( avg > 0.15954 )
									ret := 0.892857 // buy
							if( avg2 > 0.159346 )
								if( avg <= 0.159515 )
									ret := -0.500000
								if( avg > 0.159515 )
									ret := -0.126512
					if( cr_down2Int > 0.5 )
						if( avg <= 0.161444 )
							if( avg2 <= 0.159288 )
								if( avg <= 0.151163 )
									ret := 1.000000 // buy
								if( avg > 0.151163 )
									ret := 0.485864
							if( avg2 > 0.159288 )
								if( avg2 <= 0.159602 )
									ret := -0.482759
								if( avg2 > 0.159602 )
									ret := 0.392593
						if( avg > 0.161444 )
							if( avg <= 0.162146 )
								if( avg2 <= 0.161924 )
									ret := -0.526316
								if( avg2 > 0.161924 )
									ret := -0.941176 // sell
							if( avg > 0.162146 )
								if( avg <= 0.16224 )
									ret := 1.000000 // buy
								if( avg > 0.16224 )
									ret := -0.023810
			if( cr_downInt > 0.5 )
				if( avg <= 0.124078 )
					if( avg <= 0.115218 )
						if( avg2 <= 0.112182 )
							if( avg2 <= 0.111597 )
								if( avg2 <= 0.111008 )
									ret := 0.625000
								if( avg2 > 0.111008 )
									ret := -0.027778
							if( avg2 > 0.111597 )
								if( avg <= 0.111806 )
									ret := 0.500000
								if( avg > 0.111806 )
									ret := 0.259259
						if( avg2 > 0.112182 )
							if( avg2 <= 0.114055 )
								if( cr_down2Int <= 0.5 )
									ret := -0.165323
								if( cr_down2Int > 0.5 )
									ret := -0.258427
							if( avg2 > 0.114055 )
								if( cr_down2Int <= 0.5 )
									ret := 0.045802
								if( cr_down2Int > 0.5 )
									ret := 0.114754
					if( avg > 0.115218 )
						if( avg <= 0.116581 )
							if( cr_down2Int <= 0.5 )
								if( avg <= 0.116455 )
									ret := 0.163636
								if( avg > 0.116455 )
									ret := 0.760000 // buy
							if( cr_down2Int > 0.5 )
								if( avg <= 0.116034 )
									ret := 0.411765
								if( avg > 0.116034 )
									ret := 0.758621 // buy
						if( avg > 0.116581 )
							if( cr_down2Int <= 0.5 )
								if( avg <= 0.117084 )
									ret := -0.181034
								if( avg > 0.117084 )
									ret := 0.181261
							if( cr_down2Int > 0.5 )
								if( avg <= 0.121919 )
									ret := 0.057292
								if( avg > 0.121919 )
									ret := 0.380074
				if( avg > 0.124078 )
					if( cr_down2Int <= 0.5 )
						if( avg <= 0.16518 )
							if( avg <= 0.164338 )
								if( avg2 <= 0.12402 )
									ret := -0.266667
								if( avg2 > 0.12402 )
									ret := 0.514722
							if( avg > 0.164338 )
								if( avg2 <= 0.164843 )
									ret := -0.125000
								if( avg2 > 0.164843 )
									ret := -0.423077
						if( avg > 0.16518 )
							if( avg <= 0.167341 )
								if( avg2 <= 0.165193 )
									ret := 0.565217
								if( avg2 > 0.165193 )
									ret := 0.928571 // buy
							if( avg > 0.167341 )
								if( avg <= 0.167999 )
									ret := 0.416667
								if( avg > 0.167999 )
									ret := 0.857143 // buy
					if( cr_down2Int > 0.5 )
						if( avg2 <= 0.15557 )
							if( avg <= 0.125516 )
								if( avg2 <= 0.125273 )
									ret := 0.492248
								if( avg2 > 0.125273 )
									ret := -0.285714
							if( avg > 0.125516 )
								if( avg <= 0.154972 )
									ret := 0.631233
								if( avg > 0.154972 )
									ret := 0.888199 // buy
						if( avg2 > 0.15557 )
							if( avg <= 0.155785 )
								if( avg <= 0.155678 )
									ret := -0.611111
								if( avg > 0.155678 )
									ret := -0.894737 // sell
							if( avg > 0.155785 )
								if( avg <= 0.16037 )
									ret := 0.493750
								if( avg > 0.16037 )
									ret := 0.059361
		if( cr_upInt > 0.5 )
			if( cr_up2Int <= 0.5 )
				if( avg2 <= 0.125033 )
					if( avg2 <= 0.124761 )
						if( avg2 <= 0.124683 )
							if( avg <= 0.124734 )
								if( avg2 <= 0.12432 )
									ret := -0.122807
								if( avg2 > 0.12432 )
									ret := 0.099237
							if( avg > 0.124734 )
								ret := -0.533333
						if( avg2 > 0.124683 )
							if( avg <= 0.124775 )
								ret := -0.444444
							if( avg > 0.124775 )
								ret := -1.000000 // sell
					if( avg2 > 0.124761 )
						if( avg2 <= 0.124937 )
							ret := 0.608696
						if( avg2 > 0.124937 )
							ret := -0.052632
				if( avg2 > 0.125033 )
					if( avg2 <= 0.130219 )
						if( avg2 <= 0.130023 )
							if( avg <= 0.125706 )
								if( avg <= 0.125492 )
									ret := -0.403509
								if( avg > 0.125492 )
									ret := -0.763636 // sell
							if( avg > 0.125706 )
								if( avg2 <= 0.126868 )
									ret := -0.178788
								if( avg2 > 0.126868 )
									ret := -0.349438
						if( avg2 > 0.130023 )
							if( avg <= 0.13015 )
								ret := 0.428571
							if( avg > 0.13015 )
								ret := 0.600000
					if( avg2 > 0.130219 )
						if( avg2 <= 0.134026 )
							if( avg <= 0.134022 )
								if( avg <= 0.132273 )
									ret := -0.662125
								if( avg > 0.132273 )
									ret := -0.486420
							if( avg > 0.134022 )
								if( avg2 <= 0.133955 )
									ret := -1.000000 // sell
								if( avg2 > 0.133955 )
									ret := -0.692308
						if( avg2 > 0.134026 )
							if( avg2 <= 0.134272 )
								if( avg2 <= 0.134188 )
									ret := -0.092593
								if( avg2 > 0.134188 )
									ret := 0.260870
							if( avg2 > 0.134272 )
								if( avg2 <= 0.154668 )
									ret := -0.446760
								if( avg2 > 0.154668 )
									ret := -0.378611
			if( cr_up2Int > 0.5 )
				if( avg <= 0.123957 )
					if( avg2 <= 0.123213 )
						if( avg2 <= 0.115883 )
							if( avg <= 0.111906 )
								if( avg2 <= 0.111629 )
									ret := -0.250000
								if( avg2 > 0.111629 )
									ret := -0.666667
							if( avg > 0.111906 )
								if( avg <= 0.11347 )
									ret := 0.000000
								if( avg > 0.11347 )
									ret := 0.189189
						if( avg2 > 0.115883 )
							if( avg2 <= 0.121584 )
								if( avg <= 0.120114 )
									ret := -0.355556
								if( avg > 0.120114 )
									ret := -0.857143 // sell
							if( avg2 > 0.121584 )
								if( avg <= 0.121839 )
									ret := 0.789474 // buy
								if( avg > 0.121839 )
									ret := -0.406504
					if( avg2 > 0.123213 )
						if( avg2 <= 0.123434 )
							if( avg2 <= 0.123386 )
								ret := 0.714286 // buy
							if( avg2 > 0.123386 )
								ret := 0.545455
						if( avg2 > 0.123434 )
							if( avg2 <= 0.123523 )
								ret := -0.578947
							if( avg2 > 0.123523 )
								if( avg2 <= 0.123721 )
									ret := 0.375000
								if( avg2 > 0.123721 )
									ret := 0.000000
				if( avg > 0.123957 )
					if( avg2 <= 0.160628 )
						if( avg2 <= 0.127848 )
							if( avg2 <= 0.12418 )
								if( avg <= 0.124157 )
									ret := -1.000000 // sell
								if( avg > 0.124157 )
									ret := -0.631579
							if( avg2 > 0.12418 )
								if( avg2 <= 0.124284 )
									ret := 0.400000
								if( avg2 > 0.124284 )
									ret := -0.604410
						if( avg2 > 0.127848 )
							if( avg2 <= 0.136356 )
								if( avg2 <= 0.135596 )
									ret := -0.342958
								if( avg2 > 0.135596 )
									ret := 0.218750
							if( avg2 > 0.136356 )
								if( avg <= 0.160406 )
									ret := -0.465106
								if( avg > 0.160406 )
									ret := -1.000000 // sell
					if( avg2 > 0.160628 )
						if( avg2 <= 0.16205 )
							if( avg <= 0.160749 )
								ret := 0.888889 // buy
							if( avg > 0.160749 )
								if( avg2 <= 0.161081 )
									ret := -0.138889
								if( avg2 > 0.161081 )
									ret := 0.605263
						if( avg2 > 0.16205 )
							if( avg2 <= 0.163172 )
								if( avg2 <= 0.163121 )
									ret := -0.729730 // sell
								if( avg2 > 0.163121 )
									ret := -1.000000 // sell
							if( avg2 > 0.163172 )
								if( avg2 <= 0.164221 )
									ret := 0.666667
								if( avg2 > 0.164221 )
									ret := -0.444444
	if( ma_downInt > 0.5 )
		if( cr_downInt <= 0.5 )
			if( cr_up2Int <= 0.5 )
				if( avg <= 0.159974 )
					if( cr_down2Int <= 0.5 )
						if( cr_upInt <= 0.5 )
							if( avg2 <= 0.126583 )
								if( avg2 <= 0.111179 )
									ret := 0.429429
								if( avg2 > 0.111179 )
									ret := 0.001732
							if( avg2 > 0.126583 )
								if( avg2 <= 0.126758 )
									ret := 0.315217
								if( avg2 > 0.126758 )
									ret := 0.093136
						if( cr_upInt > 0.5 )
							if( avg <= 0.124455 )
								if( avg2 <= 0.111513 )
									ret := -0.405063
								if( avg2 > 0.111513 )
									ret := 0.014109
							if( avg > 0.124455 )
								if( avg2 <= 0.134579 )
									ret := -0.233572
								if( avg2 > 0.134579 )
									ret := -0.404047
					if( cr_down2Int > 0.5 )
						if( avg2 <= 0.124748 )
							if( avg2 <= 0.114772 )
								if( avg <= 0.111417 )
									ret := -0.187500
								if( avg > 0.111417 )
									ret := 0.398340
							if( avg2 > 0.114772 )
								if( avg <= 0.115999 )
									ret := -0.318182
								if( avg > 0.115999 )
									ret := 0.061056
						if( avg2 > 0.124748 )
							if( avg2 <= 0.138199 )
								if( avg <= 0.134537 )
									ret := 0.405660
								if( avg > 0.134537 )
									ret := 0.174721
							if( avg2 > 0.138199 )
								if( avg <= 0.159635 )
									ret := 0.564526
								if( avg > 0.159635 )
									ret := 0.000000
				if( avg > 0.159974 )
					if( avg2 <= 0.166668 )
						if( avg <= 0.1602 )
							if( avg2 <= 0.160736 )
								if( cr_down2Int <= 0.5 )
									ret := -0.335099
								if( cr_down2Int > 0.5 )
									ret := -0.320000
							if( avg2 > 0.160736 )
								if( avg <= 0.160141 )
									ret := 0.933333 // buy
								if( avg > 0.160141 )
									ret := 0.333333
						if( avg > 0.1602 )
							if( avg <= 0.16104 )
								if( cr_down2Int <= 0.5 )
									ret := 0.069659
								if( cr_down2Int > 0.5 )
									ret := 0.467532
							if( avg > 0.16104 )
								if( avg <= 0.162642 )
									ret := -0.204998
								if( avg > 0.162642 )
									ret := 0.004317
					if( avg2 > 0.166668 )
						if( cr_down2Int <= 0.5 )
							if( avg <= 0.166674 )
								ret := -0.941176 // sell
							if( avg > 0.166674 )
								if( avg2 <= 0.167711 )
									ret := 0.185629
								if( avg2 > 0.167711 )
									ret := -0.387500
						if( cr_down2Int > 0.5 )
							ret := -0.750000 // sell
			if( cr_up2Int > 0.5 )
				if( cr_upInt <= 0.5 )
					if( avg <= 0.148432 )
						if( avg2 <= 0.129059 )
							if( avg2 <= 0.127474 )
								if( avg2 <= 0.126716 )
									ret := -0.061975
								if( avg2 > 0.126716 )
									ret := -0.640625
							if( avg2 > 0.127474 )
								if( avg2 <= 0.12868 )
									ret := 0.602151
								if( avg2 > 0.12868 )
									ret := -0.058824
						if( avg2 > 0.129059 )
							if( avg2 <= 0.133244 )
								if( avg <= 0.131539 )
									ret := -0.430108
								if( avg > 0.131539 )
									ret := -0.750000 // sell
							if( avg2 > 0.133244 )
								if( avg2 <= 0.133782 )
									ret := 0.454545
								if( avg2 > 0.133782 )
									ret := -0.190476
					if( avg > 0.148432 )
						if( avg <= 0.153483 )
							if( avg2 <= 0.149959 )
								if( avg2 <= 0.148826 )
									ret := -1.000000 // sell
								if( avg2 > 0.148826 )
									ret := -0.823009 // sell
							if( avg2 > 0.149959 )
								if( avg2 <= 0.151633 )
									ret := -0.515464
								if( avg2 > 0.151633 )
									ret := -0.788889 // sell
						if( avg > 0.153483 )
							if( avg <= 0.154118 )
								if( avg2 <= 0.153912 )
									ret := 0.515152
								if( avg2 > 0.153912 )
									ret := 0.096774
							if( avg > 0.154118 )
								if( avg2 <= 0.155387 )
									ret := -0.632653
								if( avg2 > 0.155387 )
									ret := -0.344423
				if( cr_upInt > 0.5 )
					if( avg2 <= 0.160256 )
						if( avg <= 0.159786 )
							if( avg <= 0.149862 )
								if( avg2 <= 0.135815 )
									ret := -0.394480
								if( avg2 > 0.135815 )
									ret := -0.220070
							if( avg > 0.149862 )
								if( avg <= 0.153121 )
									ret := -0.597723
								if( avg > 0.153121 )
									ret := -0.391248
						if( avg > 0.159786 )
							if( avg <= 0.159933 )
								if( avg2 <= 0.159823 )
									ret := -0.333333
								if( avg2 > 0.159823 )
									ret := 0.666667
							if( avg > 0.159933 )
								if( avg <= 0.160064 )
									ret := -0.590909
								if( avg > 0.160064 )
									ret := 0.727273 // buy
					if( avg2 > 0.160256 )
						if( avg <= 0.16469 )
							if( avg <= 0.163048 )
								if( avg <= 0.16056 )
									ret := -0.891304 // sell
								if( avg > 0.16056 )
									ret := -0.666667
							if( avg > 0.163048 )
								if( avg <= 0.163798 )
									ret := -1.000000 // sell
								if( avg > 0.163798 )
									ret := -0.923077 // sell
						if( avg > 0.16469 )
							ret := 0.222222
		if( cr_downInt > 0.5 )
			if( avg2 <= 0.122257 )
				if( avg <= 0.122058 )
					if( avg <= 0.121063 )
						if( cr_down2Int <= 0.5 )
							if( avg <= 0.119416 )
								if( avg2 <= 0.119103 )
									ret := 0.000000
								if( avg2 > 0.119103 )
									ret := 0.743590 // buy
							if( avg > 0.119416 )
								if( avg2 <= 0.120225 )
									ret := 0.214286
								if( avg2 > 0.120225 )
									ret := -0.741379 // sell
						if( cr_down2Int > 0.5 )
							if( avg <= 0.115034 )
								if( avg <= 0.114751 )
									ret := 0.063380
								if( avg > 0.114751 )
									ret := -0.574468
							if( avg > 0.115034 )
								if( avg <= 0.116628 )
									ret := 0.551282
								if( avg > 0.116628 )
									ret := -0.028986
					if( avg > 0.121063 )
						if( cr_down2Int <= 0.5 )
							if( avg <= 0.121916 )
								if( avg <= 0.121374 )
									ret := 0.440000
								if( avg > 0.121374 )
									ret := 0.809524 // buy
							if( avg > 0.121916 )
								ret := 0.066667
						if( cr_down2Int > 0.5 )
							if( avg2 <= 0.12191 )
								if( avg2 <= 0.121647 )
									ret := -0.461538
								if( avg2 > 0.121647 )
									ret := -0.095238
							if( avg2 > 0.12191 )
								if( avg2 <= 0.12197 )
									ret := 0.500000
								if( avg2 > 0.12197 )
									ret := 0.250000
				if( avg > 0.122058 )
					if( avg <= 0.122135 )
						ret := -0.722222 // sell
					if( avg > 0.122135 )
						if( avg2 <= 0.122208 )
							ret := -0.428571
						if( avg2 > 0.122208 )
							ret := 0.055556
			if( avg2 > 0.122257 )
				if( avg2 <= 0.162324 )
					if( cr_down2Int <= 0.5 )
						if( avg <= 0.141567 )
							if( avg <= 0.134216 )
								if( avg <= 0.125723 )
									ret := 0.339915
								if( avg > 0.125723 )
									ret := 0.559601
							if( avg > 0.134216 )
								if( avg2 <= 0.13492 )
									ret := 0.039474
								if( avg2 > 0.13492 )
									ret := 0.428571
						if( avg > 0.141567 )
							if( avg2 <= 0.157764 )
								if( avg <= 0.154935 )
									ret := 0.579732
								if( avg > 0.154935 )
									ret := 0.718984 // buy
							if( avg2 > 0.157764 )
								if( avg <= 0.15945 )
									ret := 0.110204
								if( avg > 0.15945 )
									ret := 0.512868
					if( cr_down2Int > 0.5 )
						if( avg2 <= 0.160371 )
							if( avg <= 0.159447 )
								if( avg <= 0.15587 )
									ret := 0.608703
								if( avg > 0.15587 )
									ret := 0.368321
							if( avg > 0.159447 )
								if( avg2 <= 0.160297 )
									ret := 0.882759 // buy
								if( avg2 > 0.160297 )
									ret := 0.684211
						if( avg2 > 0.160371 )
							if( avg2 <= 0.160542 )
								if( avg2 <= 0.160445 )
									ret := -0.545455
								if( avg2 > 0.160445 )
									ret := -0.888889 // sell
							if( avg2 > 0.160542 )
								if( avg <= 0.16152 )
									ret := 0.534653
								if( avg > 0.16152 )
									ret := -0.128205
				if( avg2 > 0.162324 )
					if( cr_down2Int <= 0.5 )
						if( avg2 <= 0.164588 )
							if( avg2 <= 0.163797 )
								if( avg2 <= 0.162695 )
									ret := -0.769231 // sell
								if( avg2 > 0.162695 )
									ret := -0.153846
							if( avg2 > 0.163797 )
								ret := -1.000000 // sell
						if( avg2 > 0.164588 )
							if( avg2 <= 0.165669 )
								if( avg2 <= 0.165188 )
									ret := 0.263158
								if( avg2 > 0.165188 )
									ret := 0.870968 // buy
							if( avg2 > 0.165669 )
								if( avg <= 0.16701 )
									ret := -0.972222 // sell
								if( avg > 0.16701 )
									ret := -0.423077
					if( cr_down2Int > 0.5 )
						if( avg2 <= 0.163066 )
							ret := -0.333333
						if( avg2 > 0.163066 )
							if( avg <= 0.164485 )
								if( avg <= 0.163169 )
									ret := 0.916667 // buy
								if( avg > 0.163169 )
									ret := 0.250000
							if( avg > 0.164485 )
								ret := 0.944444 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ultimate_MA_MTF_V2 
//@version=5
//indicator title="CM_Ultimate_MA_MTF_V2", shorttitle="CM_Ultimate_MA_MTF_V2", overlay=true)

// Inputs
src = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="D")
len = input.int(20, title="Moving Average Length - LookBack Period")
factorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
spc = input(false, title="Show Price Crossing 1st Mov Avg - Highlight Bar?")
cc = input(true, title="Change Color Based On Direction?")
smoothe = input.int(2, minval=1, maxval=10, title="Color Smoothing - Setting 1 = No Smoothing")
doma2 = input(false, title="Optional 2nd Moving Average")
spc2 = input(false, title="Show Price Crossing 2nd Mov Avg?")
len2 = input.int(50, title="Moving Average Length - Optional 2nd MA")
sfactorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype2 = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
cc2 = input(true, title="Change Color Based On Direction 2nd MA?")
warn = input(false, title="***You Can Turn On The Show Dots Parameter Below Without Plotting 2nd MA to See Crosses***")
warn2 = input(false, title="***If Using Cross Feature W/O Plotting 2ndMA - Make Sure 2ndMA Parameters are Set Correctly***")
sd = input(false, title="Show Dots on Cross of Both MA's")

res = useCurrentRes ? timeframe.period : resCustom

// Hull MA definition
hullma = ta.wma(2 * ta.wma(src, len / 2) - ta.wma(src, len), math.round(math.sqrt(len)))

// TEMA definition
ema1 = ta.ema(src, len)
ema2 = ta.ema(ema1, len)
ema3 = ta.ema(ema2, len)
tema = 3 * (ema1 - ema2) + ema3

// Tilson T3 definition
factor = factorT3 * 0.10
gd(src, len, factor) => ta.ema(src, len) * (1 + factor) - ta.ema(ta.ema(src, len), len) * factor
t3(src, len, factor) => gd(gd(gd(src, len, factor), len, factor), len, factor)
tilT3 = t3(src, len, factor)

avg = atype == 1 ? ta.sma(src, len) : atype == 2 ? ta.ema(src, len) : atype == 3 ? ta.wma(src, len) : atype == 4 ? hullma : atype == 5 ? ta.vwma(src, len) : atype == 6 ? ta.rma(src, len) : atype == 7 ? tema : tilT3

// 2nd MA definitions
hullma2 = ta.wma(2 * ta.wma(src, len2 / 2) - ta.wma(src, len2), math.round(math.sqrt(len2)))
sema1 = ta.ema(src, len2)
sema2 = ta.ema(sema1, len2)
sema3 = ta.ema(sema2, len2)
stema = 3 * (sema1 - sema2) + sema3
sfactor = sfactorT3 * 0.10
sgd(src, len2, sfactor) => ta.ema(src, len2) * (1 + sfactor) - ta.ema(ta.ema(src, len2), len2) * sfactor
st3(src, len2, sfactor) => sgd(sgd(gd(src, len2, sfactor), len2, sfactor), len2, sfactor)
stilT3 = st3(src, len2, sfactor)

avg2 = atype2 == 1 ? ta.sma(src, len2) : atype2 == 2 ? ta.ema(src, len2) : atype2 == 3 ? ta.wma(src, len2) : atype2 == 4 ? hullma2 : atype2 == 5 ? ta.vwma(src, len2) : atype2 == 6 ? ta.rma(src, len2) : atype2 == 7 ? stema : stilT3

out1 = request.security(syminfo.tickerid, res, avg)
out2 = request.security(syminfo.tickerid, res, avg2)

// Formula for Price Crossing Moving Average #1
cr_up = open < out1 and close > out1
cr_down = open > out1 and close < out1

// Formula for Price Crossing Moving Average #2
cr_up2 = open < out2 and close > out2
cr_down2 = open > out2 and close < out2

// Barcolor Criteria for Price Crossing Moving Average #1
iscrossUp() => cr_up
iscrossDown() => cr_down

// Barcolor Criteria for Price Crossing Moving Average #2
iscrossUp2() => cr_up2
iscrossDown2() => cr_down2

ma_up = out1 >= ta.valuewhen(out1[smoothe] >= out1[1], out1[smoothe], 1)
ma_down = out1 < ta.valuewhen(out1[smoothe] < out1[1], out1[smoothe], 1)

col = cc ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.aqua
col2 = cc2 ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.white

plot(out1, title="Multi-Timeframe Moving Avg", linewidth=4, color=col)
plot(doma2 and out2 ? out2 : na, title="2nd Multi-TimeFrame Moving Average", linewidth=4, color=col2)
plot(sd and ta.crossover(out1, out2) ? out2 : na, style=plot.style_cross, linewidth=15, color=color.aqua)

// Barcolor Plot for Price Crossing Moving Average #1
barcolor(spc and iscrossUp() ? color.yellow : na)
barcolor(spc and iscrossDown() ? color.yellow : na)

// Barcolor Plot for Price Crossing Moving Average #2
barcolor(spc2 and iscrossUp2() ? color.yellow : na)
barcolor(spc2 and iscrossDown2() ? color.yellow : na)

cr_upInt = cr_up ? 1: 0    //Bool to int
cr_up2Int = cr_up2 ? 1: 0    //Bool to int
cr_downInt = cr_down ? 1: 0    //Bool to int
cr_down2Int = cr_down2 ? 1: 0    //Bool to int
ma_upInt = ma_up ? 1: 0    //Bool to int
ma_downInt = ma_down ? 1: 0    //Bool to int

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
float op_operation = decision_tree_0_TRXUSDT_1Min_d27ca286(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)

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



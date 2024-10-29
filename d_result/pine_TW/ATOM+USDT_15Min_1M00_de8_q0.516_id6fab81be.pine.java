//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: ATOMUSDT_15Min_1M00_6fab81be Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1M00_6fab81be", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_6fab81be(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.20135e+06 )
		if( Positive_Money_Flow_Sum <= 440141 )
			if( Typical_Price <= 5.03296 )
				if( Negative_Money_Flow <= 1145.61 )
					if( Positive_Money_Flow_Sum <= 224515 )
						if( MFI_High <= -28.6084 )
							if( Typical_Price <= 4.44834 )
								if( Positive_Money_Flow_Sum <= 173348 )
									ret := 0.047619
								if( Positive_Money_Flow_Sum > 173348 )
									ret := 0.709091 // buy
							if( Typical_Price > 4.44834 )
								if( MFI_Low <= 23.7636 )
									ret := 0.040404
								if( MFI_Low > 23.7636 )
									ret := 0.625000
						if( MFI_High > -28.6084 )
							if( Typical_Price <= 4.56083 )
								ret := -0.333333
							if( Typical_Price > 4.56083 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 224515 )
						if( Positive_Money_Flow_Sum <= 280417 )
							if( Raw_Money_Flow <= 26077.8 )
								if( Raw_Money_Flow <= 23274.3 )
									ret := -0.361702
								if( Raw_Money_Flow > 23274.3 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 26077.8 )
								if( Positive_Money_Flow_Sum <= 247697 )
									ret := 0.093023
								if( Positive_Money_Flow_Sum > 247697 )
									ret := -0.267857
						if( Positive_Money_Flow_Sum > 280417 )
							if( MFI <= 45.2672 )
								if( Positive_Money_Flow_Sum <= 299908 )
									ret := 0.153846
								if( Positive_Money_Flow_Sum > 299908 )
									ret := -0.247423
							if( MFI > 45.2672 )
								if( MFI <= 46.7144 )
									ret := 0.578947
								if( MFI > 46.7144 )
									ret := 0.070968
				if( Negative_Money_Flow > 1145.61 )
					if( Positive_Money_Flow_Sum <= 217312 )
						if( Raw_Money_Flow <= 89946.9 )
							if( MFI_Low <= 14.7098 )
								if( MFI <= 20.4762 )
									ret := 0.509804
								if( MFI > 20.4762 )
									ret := 0.129771
							if( MFI_Low > 14.7098 )
								if( MFI_High <= -44.4246 )
									ret := -0.714286 // sell
								if( MFI_High > -44.4246 )
									ret := -0.107143
						if( Raw_Money_Flow > 89946.9 )
							if( Money_Flow_Ratio <= 0.285739 )
								if( Negative_Money_Flow <= 270538 )
									ret := 0.052632
								if( Negative_Money_Flow > 270538 )
									ret := -0.363636
							if( Money_Flow_Ratio > 0.285739 )
								if( Negative_Money_Flow <= 117817 )
									ret := -0.933333 // sell
								if( Negative_Money_Flow > 117817 )
									ret := -0.555556
					if( Positive_Money_Flow_Sum > 217312 )
						if( Positive_Money_Flow_Sum <= 225566 )
							if( MFI <= 38.6981 )
								ret := 0.454545
							if( MFI > 38.6981 )
								ret := 0.785714 // buy
						if( Positive_Money_Flow_Sum > 225566 )
							if( Negative_Money_Flow_Sum <= 1.09251e+06 )
								if( MFI <= 25.2629 )
									ret := 0.630435
								if( MFI > 25.2629 )
									ret := 0.169788
							if( Negative_Money_Flow_Sum > 1.09251e+06 )
								if( Negative_Money_Flow_Sum <= 1.1329e+06 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 1.1329e+06 )
									ret := 0.076923
			if( Typical_Price > 5.03296 )
				if( Negative_Money_Flow_Sum <= 535882 )
					if( Money_Flow_Ratio <= 0.155747 )
						ret := -0.833333 // sell
					if( Money_Flow_Ratio > 0.155747 )
						if( Typical_Price <= 5.87936 )
							if( Negative_Money_Flow <= 76243.7 )
								if( Negative_Money_Flow <= 25187.6 )
									ret := -0.307054
								if( Negative_Money_Flow > 25187.6 )
									ret := 0.129032
							if( Negative_Money_Flow > 76243.7 )
								if( Negative_Money_Flow_Sum <= 405463 )
									ret := -0.852941 // sell
								if( Negative_Money_Flow_Sum > 405463 )
									ret := -0.222222
						if( Typical_Price > 5.87936 )
							if( Typical_Price <= 5.90641 )
								ret := 0.769231 // buy
							if( Typical_Price > 5.90641 )
								if( Negative_Money_Flow <= 170076 )
									ret := 0.000945
								if( Negative_Money_Flow > 170076 )
									ret := -0.394737
				if( Negative_Money_Flow_Sum > 535882 )
					if( Raw_Money_Flow <= 196183 )
						if( MFI <= 43.1718 )
							if( Negative_Money_Flow_Sum <= 684958 )
								if( Negative_Money_Flow <= 158986 )
									ret := -0.046863
								if( Negative_Money_Flow > 158986 )
									ret := -0.557377
							if( Negative_Money_Flow_Sum > 684958 )
								if( MFI_Low <= 11.961 )
									ret := -0.124677
								if( MFI_Low > 11.961 )
									ret := -0.316532
						if( MFI > 43.1718 )
							if( Positive_Money_Flow <= 58471.2 )
								if( Raw_Money_Flow <= 49140.5 )
									ret := -0.863636 // sell
								if( Raw_Money_Flow > 49140.5 )
									ret := -0.461538
							if( Positive_Money_Flow > 58471.2 )
								ret := -0.294118
					if( Raw_Money_Flow > 196183 )
						if( Money_Flow_Ratio <= 0.463494 )
							if( Positive_Money_Flow_Sum <= 395474 )
								if( MFI_High <= -54.7409 )
									ret := -0.077922
								if( MFI_High > -54.7409 )
									ret := 0.294118
							if( Positive_Money_Flow_Sum > 395474 )
								if( Negative_Money_Flow <= 309612 )
									ret := -0.909091 // sell
								if( Negative_Money_Flow > 309612 )
									ret := -0.235294
						if( Money_Flow_Ratio > 0.463494 )
							if( MFI <= 35.2646 )
								if( Negative_Money_Flow_Sum <= 832181 )
									ret := 0.896552 // buy
								if( Negative_Money_Flow_Sum > 832181 )
									ret := 0.333333
							if( MFI > 35.2646 )
								ret := -0.076923
		if( Positive_Money_Flow_Sum > 440141 )
			if( Positive_Money_Flow_Sum <= 5.67061e+06 )
				if( Positive_Money_Flow_Sum <= 4.63481e+06 )
					if( Negative_Money_Flow_Sum <= 131722 )
						if( MFI_High <= 6.71267 )
							if( Typical_Price <= 7.21167 )
								if( Typical_Price <= 4.77833 )
									ret := 0.065217
								if( Typical_Price > 4.77833 )
									ret := 0.623762
							if( Typical_Price > 7.21167 )
								if( Typical_Price <= 9.52603 )
									ret := -0.122449
								if( Typical_Price > 9.52603 )
									ret := 0.625000
						if( MFI_High > 6.71267 )
							if( Positive_Money_Flow <= 100763 )
								if( Typical_Price <= 6.6195 )
									ret := -0.254545
								if( Typical_Price > 6.6195 )
									ret := 0.160920
							if( Positive_Money_Flow > 100763 )
								if( Raw_Money_Flow <= 150904 )
									ret := 0.574468
								if( Raw_Money_Flow > 150904 )
									ret := -0.024390
					if( Negative_Money_Flow_Sum > 131722 )
						if( MFI_Low <= 71.212 )
							if( Negative_Money_Flow_Sum <= 361797 )
								if( Raw_Money_Flow <= 120450 )
									ret := 0.018106
								if( Raw_Money_Flow > 120450 )
									ret := -0.135417
							if( Negative_Money_Flow_Sum > 361797 )
								if( Negative_Money_Flow_Sum <= 1.06511e+06 )
									ret := 0.050154
								if( Negative_Money_Flow_Sum > 1.06511e+06 )
									ret := -0.020756
						if( MFI_Low > 71.212 )
							if( Typical_Price <= 13.2979 )
								if( Raw_Money_Flow <= 681142 )
									ret := -0.420290
								if( Raw_Money_Flow > 681142 )
									ret := 0.285714
							if( Typical_Price > 13.2979 )
								ret := 0.500000
				if( Positive_Money_Flow_Sum > 4.63481e+06 )
					if( Positive_Money_Flow_Sum <= 4.65636e+06 )
						ret := 0.900000 // buy
					if( Positive_Money_Flow_Sum > 4.65636e+06 )
						if( Typical_Price <= 8.36718 )
							if( Negative_Money_Flow <= 55433.5 )
								if( Positive_Money_Flow <= 733030 )
									ret := 0.000000
								if( Positive_Money_Flow > 733030 )
									ret := 0.888889 // buy
							if( Negative_Money_Flow > 55433.5 )
								ret := 1.000000 // buy
						if( Typical_Price > 8.36718 )
							if( Typical_Price <= 9.37738 )
								if( Raw_Money_Flow <= 458058 )
									ret := 0.000000
								if( Raw_Money_Flow > 458058 )
									ret := -0.550000
							if( Typical_Price > 9.37738 )
								if( Typical_Price <= 11.7673 )
									ret := 0.375000
								if( Typical_Price > 11.7673 )
									ret := -0.080000
			if( Positive_Money_Flow_Sum > 5.67061e+06 )
				if( Typical_Price <= 12.1657 )
					if( Negative_Money_Flow_Sum <= 1.13376e+06 )
						if( Raw_Money_Flow <= 1.39306e+06 )
							if( Positive_Money_Flow <= 866288 )
								if( Typical_Price <= 11.2199 )
									ret := -0.666667
								if( Typical_Price > 11.2199 )
									ret := -0.317073
							if( Positive_Money_Flow > 866288 )
								if( MFI_High <= 11.3004 )
									ret := 0.393939
								if( MFI_High > 11.3004 )
									ret := -0.636364
						if( Raw_Money_Flow > 1.39306e+06 )
							if( Negative_Money_Flow_Sum <= 1.0483e+06 )
								if( Positive_Money_Flow_Sum <= 7.77021e+06 )
									ret := -0.807692 // sell
								if( Positive_Money_Flow_Sum > 7.77021e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.0483e+06 )
								ret := -0.545455
					if( Negative_Money_Flow_Sum > 1.13376e+06 )
						if( Typical_Price <= 10.4231 )
							ret := 0.722222 // buy
						if( Typical_Price > 10.4231 )
							if( MFI_Low <= 66.3582 )
								ret := -0.538462
							if( MFI_Low > 66.3582 )
								ret := 0.100000
				if( Typical_Price > 12.1657 )
					if( Positive_Money_Flow_Sum <= 1.26134e+07 )
						if( MFI <= 91.9843 )
							if( MFI_Low <= 67.3659 )
								if( Raw_Money_Flow <= 550117 )
									ret := 0.000000
								if( Raw_Money_Flow > 550117 )
									ret := 0.933333 // buy
							if( MFI_Low > 67.3659 )
								if( Raw_Money_Flow <= 607856 )
									ret := 0.384615
								if( Raw_Money_Flow > 607856 )
									ret := -0.489362
						if( MFI > 91.9843 )
							if( Positive_Money_Flow_Sum <= 1.1594e+07 )
								if( MFI_High <= 14.3317 )
									ret := 1.000000 // buy
								if( MFI_High > 14.3317 )
									ret := 0.636364
							if( Positive_Money_Flow_Sum > 1.1594e+07 )
								ret := 0.444444
					if( Positive_Money_Flow_Sum > 1.26134e+07 )
						if( MFI_High <= 15.8957 )
							ret := -1.000000 // sell
						if( MFI_High > 15.8957 )
							ret := -0.833333 // sell
	if( Negative_Money_Flow_Sum > 1.20135e+06 )
		if( Typical_Price <= 10.7503 )
			if( Negative_Money_Flow_Sum <= 7.76993e+06 )
				if( Negative_Money_Flow_Sum <= 1.26763e+06 )
					if( Negative_Money_Flow_Sum <= 1.2248e+06 )
						if( Positive_Money_Flow <= 233275 )
							if( MFI_High <= -23.9436 )
								if( Typical_Price <= 8.23897 )
									ret := -0.091503
								if( Typical_Price > 8.23897 )
									ret := 0.303665
							if( MFI_High > -23.9436 )
								if( Money_Flow_Ratio <= 1.47181 )
									ret := -0.781250 // sell
								if( Money_Flow_Ratio > 1.47181 )
									ret := 0.015625
						if( Positive_Money_Flow > 233275 )
							if( Negative_Money_Flow_Sum <= 1.2208e+06 )
								if( Negative_Money_Flow_Sum <= 1.21642e+06 )
									ret := 0.625000
								if( Negative_Money_Flow_Sum > 1.21642e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.2208e+06 )
								ret := 0.444444
					if( Negative_Money_Flow_Sum > 1.2248e+06 )
						if( Positive_Money_Flow_Sum <= 993990 )
							if( MFI <= 41.5791 )
								if( Negative_Money_Flow <= 146350 )
									ret := 0.366038
								if( Negative_Money_Flow > 146350 )
									ret := -0.066667
							if( MFI > 41.5791 )
								if( Negative_Money_Flow <= 176234 )
									ret := -0.200000
								if( Negative_Money_Flow > 176234 )
									ret := -0.937500 // sell
						if( Positive_Money_Flow_Sum > 993990 )
							if( Raw_Money_Flow <= 262164 )
								if( Raw_Money_Flow <= 103199 )
									ret := 0.206349
								if( Raw_Money_Flow > 103199 )
									ret := 0.558923
							if( Raw_Money_Flow > 262164 )
								if( Typical_Price <= 6.49409 )
									ret := 1.000000 // buy
								if( Typical_Price > 6.49409 )
									ret := 0.140625
				if( Negative_Money_Flow_Sum > 1.26763e+06 )
					if( Raw_Money_Flow <= 651080 )
						if( Negative_Money_Flow <= 531246 )
							if( MFI <= 68.5723 )
								if( MFI_Low <= 23.0826 )
									ret := 0.138807
								if( MFI_Low > 23.0826 )
									ret := 0.067606
							if( MFI > 68.5723 )
								if( Negative_Money_Flow_Sum <= 3.9789e+06 )
									ret := 0.282955
								if( Negative_Money_Flow_Sum > 3.9789e+06 )
									ret := -0.629630
						if( Negative_Money_Flow > 531246 )
							if( Negative_Money_Flow_Sum <= 1.44792e+06 )
								if( MFI_High <= -43.9123 )
									ret := -0.875000 // sell
								if( MFI_High > -43.9123 )
									ret := -0.090909
							if( Negative_Money_Flow_Sum > 1.44792e+06 )
								if( Negative_Money_Flow <= 600027 )
									ret := 0.485965
								if( Negative_Money_Flow > 600027 )
									ret := 0.206557
					if( Raw_Money_Flow > 651080 )
						if( Money_Flow_Ratio <= 1.78369 )
							if( Negative_Money_Flow_Sum <= 6.48446e+06 )
								if( Positive_Money_Flow <= 771042 )
									ret := 0.079797
								if( Positive_Money_Flow > 771042 )
									ret := 0.321696
							if( Negative_Money_Flow_Sum > 6.48446e+06 )
								if( Negative_Money_Flow <= 1.24823e+06 )
									ret := -0.386364
								if( Negative_Money_Flow > 1.24823e+06 )
									ret := 0.108434
						if( Money_Flow_Ratio > 1.78369 )
							if( Negative_Money_Flow_Sum <= 3.98028e+06 )
								if( Raw_Money_Flow <= 839877 )
									ret := -0.293907
								if( Raw_Money_Flow > 839877 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.98028e+06 )
								if( Negative_Money_Flow_Sum <= 6.74562e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 6.74562e+06 )
									ret := 0.307692
			if( Negative_Money_Flow_Sum > 7.76993e+06 )
				if( Positive_Money_Flow_Sum <= 2.03473e+07 )
					if( Negative_Money_Flow <= 1.23308e+06 )
						if( Raw_Money_Flow <= 417702 )
							if( MFI_Low <= 0.979995 )
								if( Negative_Money_Flow_Sum <= 1.71054e+07 )
									ret := 0.791667 // buy
								if( Negative_Money_Flow_Sum > 1.71054e+07 )
									ret := -0.250000
							if( MFI_Low > 0.979995 )
								if( Positive_Money_Flow_Sum <= 3.88415e+06 )
									ret := -0.527778
								if( Positive_Money_Flow_Sum > 3.88415e+06 )
									ret := 0.780000 // buy
						if( Raw_Money_Flow > 417702 )
							if( MFI_Low <= 1.25344 )
								if( Raw_Money_Flow <= 606136 )
									ret := 0.205128
								if( Raw_Money_Flow > 606136 )
									ret := -0.480392
							if( MFI_Low > 1.25344 )
								if( Negative_Money_Flow_Sum <= 1.02826e+07 )
									ret := 0.142857
								if( Negative_Money_Flow_Sum > 1.02826e+07 )
									ret := 0.583333
					if( Negative_Money_Flow > 1.23308e+06 )
						if( Money_Flow_Ratio <= 0.207529 )
							if( Money_Flow_Ratio <= 0.181988 )
								if( Raw_Money_Flow <= 4.30271e+06 )
									ret := 0.631579
								if( Raw_Money_Flow > 4.30271e+06 )
									ret := -0.400000
							if( Money_Flow_Ratio > 0.181988 )
								ret := -0.538462
						if( Money_Flow_Ratio > 0.207529 )
							if( Positive_Money_Flow_Sum <= 8.6023e+06 )
								if( Typical_Price <= 9.45573 )
									ret := 0.980769 // buy
								if( Typical_Price > 9.45573 )
									ret := 0.853333 // buy
							if( Positive_Money_Flow_Sum > 8.6023e+06 )
								if( Raw_Money_Flow <= 1.9682e+06 )
									ret := 0.083333
								if( Raw_Money_Flow > 1.9682e+06 )
									ret := 0.757576 // buy
				if( Positive_Money_Flow_Sum > 2.03473e+07 )
					ret := -1.000000 // sell
		if( Typical_Price > 10.7503 )
			if( Money_Flow_Ratio <= 0.655057 )
				if( Negative_Money_Flow <= 582178 )
					if( Negative_Money_Flow_Sum <= 2.25876e+07 )
						if( MFI_Low <= 15.9355 )
							if( Money_Flow_Ratio <= 0.077147 )
								if( Positive_Money_Flow <= 26571.7 )
									ret := 0.636364
								if( Positive_Money_Flow > 26571.7 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.077147 )
								if( MFI_High <= -45.0007 )
									ret := 0.053525
								if( MFI_High > -45.0007 )
									ret := -0.118227
						if( MFI_Low > 15.9355 )
							if( Positive_Money_Flow_Sum <= 1.81405e+06 )
								if( Negative_Money_Flow_Sum <= 1.74694e+06 )
									ret := 0.238462
								if( Negative_Money_Flow_Sum > 1.74694e+06 )
									ret := -0.043716
							if( Positive_Money_Flow_Sum > 1.81405e+06 )
								if( Positive_Money_Flow <= 1.59115e+06 )
									ret := 0.253398
								if( Positive_Money_Flow > 1.59115e+06 )
									ret := 0.920000 // buy
					if( Negative_Money_Flow_Sum > 2.25876e+07 )
						if( Positive_Money_Flow <= 1.72316e+06 )
							if( MFI <= 17.8075 )
								ret := -0.727273 // sell
							if( MFI > 17.8075 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 1.72316e+06 )
							ret := -0.250000
				if( Negative_Money_Flow > 582178 )
					if( Typical_Price <= 10.9094 )
						if( Money_Flow_Ratio <= 0.169938 )
							if( Negative_Money_Flow <= 1.25956e+06 )
								ret := -0.545455
							if( Negative_Money_Flow > 1.25956e+06 )
								ret := 0.111111
						if( Money_Flow_Ratio > 0.169938 )
							if( Negative_Money_Flow <= 2.26861e+06 )
								if( Negative_Money_Flow_Sum <= 3.94526e+06 )
									ret := 0.130435
								if( Negative_Money_Flow_Sum > 3.94526e+06 )
									ret := 0.780822 // buy
							if( Negative_Money_Flow > 2.26861e+06 )
								ret := 1.000000 // buy
					if( Typical_Price > 10.9094 )
						if( MFI <= 32.9138 )
							if( Negative_Money_Flow_Sum <= 2.92216e+07 )
								if( Negative_Money_Flow_Sum <= 2.71455e+07 )
									ret := 0.248877
								if( Negative_Money_Flow_Sum > 2.71455e+07 )
									ret := -0.789474 // sell
							if( Negative_Money_Flow_Sum > 2.92216e+07 )
								if( Money_Flow_Ratio <= 0.157355 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.157355 )
									ret := 0.979592 // buy
						if( MFI > 32.9138 )
							if( Negative_Money_Flow_Sum <= 6.52110e+06 )
								if( Positive_Money_Flow_Sum <= 3.4106e+06 )
									ret := -0.173913
								if( Positive_Money_Flow_Sum > 3.4106e+06 )
									ret := 0.441176
							if( Negative_Money_Flow_Sum > 6.52110e+06 )
								if( Negative_Money_Flow_Sum <= 1.6607e+07 )
									ret := 0.339350
								if( Negative_Money_Flow_Sum > 1.6607e+07 )
									ret := -0.857143 // sell
			if( Money_Flow_Ratio > 0.655057 )
				if( Negative_Money_Flow_Sum <= 4.95218e+06 )
					if( Positive_Money_Flow_Sum <= 2.15968e+06 )
						if( Negative_Money_Flow <= 729590 )
							if( MFI_Low <= 36.0354 )
								if( Negative_Money_Flow_Sum <= 1.20896e+06 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 1.20896e+06 )
									ret := 0.067209
							if( MFI_Low > 36.0354 )
								if( Raw_Money_Flow <= 220741 )
									ret := 0.493671
								if( Raw_Money_Flow > 220741 )
									ret := 0.059072
						if( Negative_Money_Flow > 729590 )
							if( MFI <= 43.8702 )
								if( MFI_High <= -38.3103 )
									ret := -1.000000 // sell
								if( MFI_High > -38.3103 )
									ret := -0.750000 // sell
							if( MFI > 43.8702 )
								if( MFI_High <= -33.5954 )
									ret := 0.200000
								if( MFI_High > -33.5954 )
									ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 2.15968e+06 )
						if( Positive_Money_Flow_Sum <= 2.41443e+07 )
							if( Money_Flow_Ratio <= 5.17042 )
								if( Positive_Money_Flow_Sum <= 1.76638e+07 )
									ret := -0.003606
								if( Positive_Money_Flow_Sum > 1.76638e+07 )
									ret := -0.720930 // sell
							if( Money_Flow_Ratio > 5.17042 )
								if( Negative_Money_Flow <= 930266 )
									ret := -0.209877
								if( Negative_Money_Flow > 930266 )
									ret := -0.878788 // sell
						if( Positive_Money_Flow_Sum > 2.41443e+07 )
							if( Positive_Money_Flow_Sum <= 2.74813e+07 )
								if( Negative_Money_Flow_Sum <= 3.48754e+06 )
									ret := 0.937500 // buy
								if( Negative_Money_Flow_Sum > 3.48754e+06 )
									ret := 0.461538
							if( Positive_Money_Flow_Sum > 2.74813e+07 )
								ret := -0.300000
				if( Negative_Money_Flow_Sum > 4.95218e+06 )
					if( Positive_Money_Flow <= 444089 )
						if( Typical_Price <= 13.1565 )
							if( Negative_Money_Flow <= 585504 )
								if( Negative_Money_Flow_Sum <= 5.04904e+06 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow_Sum > 5.04904e+06 )
									ret := 0.375691
							if( Negative_Money_Flow > 585504 )
								if( Negative_Money_Flow_Sum <= 5.72799e+06 )
									ret := -0.306250
								if( Negative_Money_Flow_Sum > 5.72799e+06 )
									ret := 0.071291
						if( Typical_Price > 13.1565 )
							if( MFI <= 61.193 )
								if( Negative_Money_Flow_Sum <= 5.26374e+06 )
									ret := 0.086957
								if( Negative_Money_Flow_Sum > 5.26374e+06 )
									ret := -0.336565
							if( MFI > 61.193 )
								if( Typical_Price <= 16.5129 )
									ret := 0.384615
								if( Typical_Price > 16.5129 )
									ret := -0.583333
					if( Positive_Money_Flow > 444089 )
						if( Raw_Money_Flow <= 2.03527e+06 )
							if( Typical_Price <= 10.8243 )
								if( Positive_Money_Flow_Sum <= 6.31443e+06 )
									ret := 0.555556
								if( Positive_Money_Flow_Sum > 6.31443e+06 )
									ret := 1.000000 // buy
							if( Typical_Price > 10.8243 )
								if( Negative_Money_Flow <= 489.934 )
									ret := -0.353949
								if( Negative_Money_Flow > 489.934 )
									ret := 0.283019
						if( Raw_Money_Flow > 2.03527e+06 )
							if( MFI <= 57.8323 )
								if( Positive_Money_Flow_Sum <= 1.48333e+07 )
									ret := -0.076923
								if( Positive_Money_Flow_Sum > 1.48333e+07 )
									ret := -0.864865 // sell
							if( MFI > 57.8323 )
								if( Positive_Money_Flow <= 3.7256e+06 )
									ret := 0.602151
								if( Positive_Money_Flow > 3.7256e+06 )
									ret := -0.303030
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_ATOMUSDT_15Min_6fab81be(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


